package it.uniroma3.siw.catering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import it.uniroma3.siw.catering.model.Ingrediente;
import it.uniroma3.siw.catering.service.IngredienteService;
import it.uniroma3.siw.catering.service.PiattoService;
import it.uniroma3.siw.catering.validator.IngredienteValidator;

@Controller
public class IngredienteController {
	@Autowired
	IngredienteService ingredienteService;
	
	@Autowired
	IngredienteValidator ingredienteValidator;
	
	@Autowired
	PiattoService piattoService;
	
	@GetMapping("/admin/insertIngredient")
	public String insertChef(Model model){
		model.addAttribute("ingrediente",new Ingrediente());
		return "admin/insertIngredient";
	}
	
	@GetMapping("/admin/ingredients")
	public String getAllIngredients(Model model){
		model.addAttribute("ingredientes", ingredienteService.getAllIngredientes());
		return "admin/ingredients";
	}


	@PostMapping("/admin/insertIngredient")
	public String registerChef(@ModelAttribute("ingrediente") Ingrediente ingrediente,
			BindingResult ingredienteBindingResult,
			Model model) {
		this.ingredienteValidator.validate(ingrediente, ingredienteBindingResult);
		if(!ingredienteBindingResult.hasErrors()) {
			model.addAttribute("ingrediente", ingrediente);		
			ingredienteService.save(ingrediente);
			return "admin/ingrediente";
		}
		return "admin/insertIngredient";
	}
	
	@GetMapping({"/ingredientsForDish/{id}"})
	public String showIngredientsForDish(@PathVariable("id") Long id, Model model) {
		model.addAttribute("piatto", piattoService.findById(id));
		return "ingredientsForDish";
	}
}
