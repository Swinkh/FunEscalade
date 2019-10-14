package com.jonathanweb.funescalade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jonathanweb.funescalade.model.Utilisateur;
import com.jonathanweb.funescalade.service.UtilisateurRepository;

@Controller
public class ConnectController {
	@Autowired
	private UtilisateurRepository utilRep;

	@GetMapping("/connexion")
	public String displayConnexion(Model model) {
		model.addAttribute("utilisateur",new Utilisateur());
		return "connexion";
	}

	@PostMapping("/connexion")
	public String DisplayResult(@ModelAttribute Utilisateur utilisateur) {
		
		
			String uName =utilisateur.getUsername();
			String pass = utilisateur.getPassword();
			Utilisateur utilDb = utilRep.findByUsernameAndPassword(uName,pass);
			if(utilDb!= null) {
				return "result";
			}else {
				return "index";
			}
	}
			
//			String dBuser= utilDb.getUsername();
//			String DbPass= utilDb.getPassword();
//			
//		
//			System.out.println(utilisateur.toString());
//			
//			
//			boolean userOk = checkStringUtil( uName,dBuser );
//			boolean passwordOk = checkStringUtil(pass,DbPass);
//			
//			if( userOk && passwordOk) {
//				return "connexion";
//			
//			}else {
//				return "index";
//			}
//			 
//			
//			
//		
//			
//		}
	
	private boolean checkStringUtil(String form,String db ) {
		if(form.equals(db)) {
			return true;
		}else{
			return false;
			
		}
		
	}
	
	

		
	}


