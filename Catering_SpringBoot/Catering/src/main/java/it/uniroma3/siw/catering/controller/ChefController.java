package it.uniroma3.siw.catering.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import it.uniroma3.siw.catering.model.Chef;
import it.uniroma3.siw.catering.service.ChefService;
import it.uniroma3.siw.catering.service.UserService;
import it.uniroma3.siw.catering.validator.ChefValidator;

@Controller
public class ChefController {

	@Autowired
	ChefService chefService;

	@Autowired
	UserService userService;

	@Autowired
	ChefValidator chefValidator;

	@GetMapping({ "/chefs" })
	public String showChefs(Model model) {
		List<Chef> chefs = chefService.getAllChefs();
		model.addAttribute("chefs", chefs);
		return "chefs";
	}

	@GetMapping({ "/admin/chefs" })
	public String showAdminChefs(Model model) {
		List<Chef> chefs = chefService.getAllChefs();
		model.addAttribute("chefs", chefs);
		return "admin/chefs";
	}

	@GetMapping("/admin/toRemoveChef/{id}")
	public String toRemoveChef(@PathVariable("id") Long id, Model model) {
		model.addAttribute("chef", chefService.findById(id));
		return "admin/confirmChefDeletion";
	}

	@GetMapping("/admin/deleteChef/{id}")
	public String deleteChef(@PathVariable("id") Long id, Model model) {

		chefService.deleteById(id);
		model.addAttribute("chefs", chefService.getAllChefs());
		return "admin/chefs";
	}

	@GetMapping("/admin/insertChef")
	public String insertChef(Model model) {
		model.addAttribute("chef", new Chef());
		return "admin/insertChef";
	}

	@PostMapping("/admin/insertChef")
	public String registerChef(@ModelAttribute("chef") Chef chef, BindingResult chefBindingResult, Model model) {
		this.chefValidator.validate(chef, chefBindingResult);
		if (!chefBindingResult.hasErrors()) {
			model.addAttribute("chef", chef);
			chefService.save(chef);
			return "admin/chef";

		}
		return "admin/insertChef";
	}

	// NOT USED
	// @GetMapping("/admin/confirmInsertChef")
	// public String confirmChef(Model model){
	// return "admin/confirmInsertChef";
	// }

	// @GetMapping("/admin/confirmInsertChef")
	// public String confirmInsertChef(@ModelAttribute Chef chef, Model model,
	// HttpSession session) {
	// chef = (Chef) model.getAttribute("chef");
	// chefService.save(chef);
	// model.addAttribute("chef",chef);
	// //return this.showChefs(model);
	// return "chef";
	// }

	@GetMapping("/admin/editChef/{id}")
	public String editChef(@PathVariable("id") Long id, Model model) {
		model.addAttribute("chef", chefService.findById(id));
		return "admin/editChef";
	}

	@PostMapping("/admin/editChef/{id}")
	public String editingChef(@PathVariable("id") Long id, @ModelAttribute("chef") Chef chef,
			BindingResult chefBindingResult, Model model) {
		Chef originalChef = chefService.findById(id);
		originalChef.setNome(chef.getNome());
		originalChef.setCognome(chef.getCognome());
		originalChef.setNazionalita(chef.getNazionalita());

		this.chefValidator.validate(originalChef, chefBindingResult);
		if (!chefBindingResult.hasErrors()) {
			List<Chef> chefs = chefService.getAllChefs();
			model.addAttribute("chefs", chefs);
			chefService.save(originalChef);
			return "admin/chefs";
		}
		model.addAttribute("chef", chefService.findById(id));
		return "admin/editChef";
	}
}
