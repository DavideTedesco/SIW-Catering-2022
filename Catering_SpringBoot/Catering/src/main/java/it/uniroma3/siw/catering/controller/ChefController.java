package it.uniroma3.siw.catering.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import it.uniroma3.siw.catering.model.Chef;
import it.uniroma3.siw.catering.model.User;
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
	
	@GetMapping({"/chefs"})
	public String showChefs(Model model) {
		//		List<Chef> chefs = chefService.getAllChefs();
		//		model.addAttribute("chefs", chefs);
		List<User> users = userService.getAllUsers();
		model.addAttribute("users",users);
		return "chefs";
	}

	@GetMapping("/admin/insertChef")
	public String insertChef(Model model){
		model.addAttribute("chef",new Chef());
		return "admin/insertChef";
	}

	@PostMapping("/admin/insertChef")
	public String registerChef(@ModelAttribute("chef") Chef chef,
			BindingResult chefBindingResult,
			Model model) {
		this.chefValidator.validate(chef, chefBindingResult);
		if(!chefBindingResult.hasErrors()) {
			model.addAttribute("chef", chef);
			return "admin/confirmInsertChef";
		}
		return "admin/insertChef";
	}
//	
//	@GetMapping("/admin/confirmInsertChef")
//	public String confirmChef(Model model){
//		return "admin/confirmInsertChef";
//	}
	
	@PostMapping("/admin/confirmInsertChef")
	public String confirmInsertChef(Model model) {
		Chef chef = (Chef) model.getAttribute("chef");
		chefService.save(chef);
		model.addAttribute("chef",chef);
		//return this.showChefs(model);
		return "chef";
	}

}
