package it.uniroma3.siw.catering.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {

	//@RequestMapping(value = "/login", method = RequestMethod.GET)
	@GetMapping({"/login"})
	public String showLoginForm (Model model) {
		return "login";
	}
	
	@GetMapping({"/admin/login"})
	public String showLoginAdminForm (Model model) {
		return "admin/login";
	}
	
	//@RequestMapping(value = "/register", method = RequestMethod.GET) 
	@GetMapping({"/register"})
	public String showRegisterForm (Model model) {
		return "register";
	}
	
	//@RequestMapping(value = "/logout", method = RequestMethod.GET) 
	@GetMapping({"/logout"})
	public String logout(Model model) {
		return "index";
	}
}
