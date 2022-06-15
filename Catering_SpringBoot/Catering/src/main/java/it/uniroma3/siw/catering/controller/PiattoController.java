package it.uniroma3.siw.catering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import it.uniroma3.siw.catering.service.BuffetService;

@Controller
public class PiattoController {
	
	@Autowired
	BuffetService buffetService;

	@GetMapping({"/dishesForBuffet/{id}"})
	public String showDishesForBuffet(@PathVariable("id") Long id, Model model) {
		model.addAttribute("buffet", buffetService.findById(id));
		return "dishesForBuffet";
	}
	
}
