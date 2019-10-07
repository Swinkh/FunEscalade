package com.jonathanweb.funescalade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jonathanweb.funescalade.model.Utilisateur;

@Controller
public class ConnectController {

	@GetMapping("/connexion")
	public String displayConnexion(Model model) {
		model.addAttribute("utilisateur",new Utilisateur());
		return "connexion";
	}

	@PostMapping("/connexion")
	public String DisplayResult(@ModelAttribute Utilisateur utilisateur) {

		return "result";
	}

}
