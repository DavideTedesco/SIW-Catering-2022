package it.uniroma3.siw.catering.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	// @RequestMapping(value = {"/", "index"}, method = RequestMethod.GET)
	@GetMapping({ "/index" })
	public String index(Model model) {
		return "index";
	}

	// @RequestMapping(value = {"/", "explore"}, method = RequestMethod.GET)
	@GetMapping({ "/explore" })
	public String explore(Model model) {
		return "explore";
	}

	// @RequestMapping(value = {"/", "explore"}, method = RequestMethod.GET)
	@GetMapping({ "/editBuffet" })
	public String editBuffet(Model model) {
		return "admin/editBuffet";
	}

	// @RequestMapping(value = {"/", "explore"}, method = RequestMethod.GET)
	@GetMapping({ "/insertIngredient" })
	public String insertIngredient(Model model) {
		return "admin/insertIngredient";
	}

	// @RequestMapping(value = {"/", "explore"}, method = RequestMethod.GET)
	@GetMapping({ "/welcomePageAdmin" })
	public String welcomePageAdmin(Model model) {
		return "admin/welcomePageAdmin";
	}

	// @RequestMapping(value = {"/", "explore"}, method = RequestMethod.GET)
	@GetMapping({ "/welcomePageUser" })
	public String welcomePageUser(Model model) {
		return "welcomePageUser";
	}

}
