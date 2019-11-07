package com.jonathanweb.funescalade.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jonathanweb.funescalade.model.Utilisateur;
import com.jonathanweb.funescalade.service.UtilisateurServices;

@Controller
public class AccountController {
	
	@Autowired
	private UtilisateurServices utilisateurServices;
	
	 @GetMapping("/account")
	    public String displayAccount( Model model) {
		 model.addAttribute("utilisateur",new Utilisateur());
	        return "account";
	    }
	 
	 @PostMapping("/account")
	 public String displayCreatedAccount(@ModelAttribute Utilisateur utilisateur) {
		 utilisateurServices.saveUtilisateur(utilisateur);
		return "myaccount";
		 
	 }
	 @GetMapping("/myaccount")
	    public String displaymyaccount( Model model) {
	       
	        return "myaccount";
	    }
}
