package it.uniroma3.siw.catering.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import it.uniroma3.siw.catering.model.Chef;
import it.uniroma3.siw.catering.model.Piatto;
import it.uniroma3.siw.catering.service.BuffetService;
import it.uniroma3.siw.catering.service.PiattoService;

@Controller
public class PiattoController {
	
	@Autowired
	BuffetService buffetService;
	
	@Autowired
	PiattoService piattoService;

	@GetMapping({"/dishesForBuffet/{id}"})
	public String showDishesForBuffet(@PathVariable("id") Long id, Model model) {
		model.addAttribute("buffet", buffetService.findById(id));
		return "dishesForBuffet";
	}
	
	@GetMapping({"/admin/dishes"})
	public String showDishes(Model model) {
		List<Piatto> dishes = piattoService.getAllDishes();
		model.addAttribute("piatti",dishes);
		return "admin/dishes";
	}
}
