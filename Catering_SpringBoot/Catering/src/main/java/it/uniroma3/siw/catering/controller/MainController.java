package it.uniroma3.siw.catering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.uniroma3.siw.catering.model.Credentials;
import it.uniroma3.siw.catering.model.User;
import it.uniroma3.siw.catering.service.CredentialsService;
import it.uniroma3.siw.catering.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	private CredentialsService credentialsService;
	
	@GetMapping({"/index"})
	public String index(Model model) {
		return "index";
	}
	
	@GetMapping({"/welcomePageUser"})
	public String welcomePageUser(Model model) {
		UserDetails userDetails = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    	Credentials credentials = credentialsService.getCredentials(userDetails.getUsername());
    	model.addAttribute("credentials", credentials);
    	User user = credentials.getUser();
    	model.addAttribute("user", user);
		return "welcomePageUser";
	}
	
	@GetMapping({"/welcomePageAdmin"})
	public String welcomePageAdmin(Model model) {
		UserDetails userDetails = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    	Credentials credentials = credentialsService.getCredentials(userDetails.getUsername());
    	model.addAttribute("credentials", credentials);
    	User user = credentials.getUser();
    	model.addAttribute("user", user);
		return "admin/welcomePageAdmin";
	}
	
	@GetMapping({"/loginError"})
	public String loginError(Model model) {
		return "loginError";
	}
	
	@GetMapping({"/explore"})
	public String explore(Model model) {
		return "explore";
	}
	
	@GetMapping({"/insertIngredient"})
	public String inserdtIgredient(Model model) {
		return "admin/insertIngredient";
	}
	
	@GetMapping({"/editBuffet"})
	public String editBuffet(Model model) {
		return "admin/editBuffet";
	}
	
	@GetMapping({"/adminWelcomePage"})
	public String adminWelcomePage(Model model) {
		return "admin/adminWelcomePage";
	}
	
	@GetMapping({"/admin/explore"})
	public String adminExplore(Model model) {
		return "admin/explore";
	}
	
	@GetMapping({"/admin/allUsers"})
	public String adminViewAllUsers(Model model) {
		model.addAttribute("users", userService.getAllUsers());
		return "admin/allUsers";
	}
	
	@GetMapping({"/welcomePage"})
	public String welcomePage(Model model) {
		return "welcomePage";
	}

}
