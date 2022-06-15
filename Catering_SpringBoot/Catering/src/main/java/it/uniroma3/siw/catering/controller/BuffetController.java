package it.uniroma3.siw.catering.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import it.uniroma3.siw.catering.model.Buffet;
import it.uniroma3.siw.catering.model.Chef;
import it.uniroma3.siw.catering.service.BuffetService;
import it.uniroma3.siw.catering.service.ChefService;

@Controller
public class BuffetController {

	@Autowired
	BuffetService buffetService;

	@Autowired
	ChefService chefService;

	@GetMapping({"/categories"})
	public String showCategories(Model model) {
		return "categories";
	}

	@GetMapping({"/buffets"})
	public String showBuffets(Model model) {
		List<Buffet> buffets = buffetService.getAllBuffets();
		model.addAttribute("buffets",buffets);
		return "buffets";
	}

	@GetMapping({"/chefBuffets/{id}"})
	public String showBuffetsForChef(@PathVariable("id") Long id, Model model) {
		model.addAttribute("chef", chefService.findById(id));
		return "buffetsForChef";
	}
	
//	@GetMapping({"/buffetsForChef"})
//	public String showSingleBuffet(Model model) {
//		return "buffetsForChef";
//	}
	

	@GetMapping({"/admin/buffets"})
	public String showBuffetsAdmin(Model model) {	
		List<Buffet> buffets = buffetService.getAllBuffets();
		model.addAttribute("buffets",buffets);
		return "admin/buffets";
	}

	@GetMapping("/admin/removeBuffet/{id}")
	public String removeBuffet(@PathVariable("id") Long id ,Model model) {
		buffetService.deleteById(id);
		model.addAttribute("buffets", buffetService.getAllBuffets());
		return "admin/chefs";
	}
}
