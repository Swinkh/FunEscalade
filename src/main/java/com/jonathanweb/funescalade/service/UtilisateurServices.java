package com.jonathanweb.funescalade.service;

import java.util.Optional;



import com.jonathanweb.funescalade.model.Utilisateur;


public interface UtilisateurServices {
	Optional<Utilisateur>  findByUsernameAndPassword(String username,String password); 
	void saveUtilisateur(Utilisateur utilisateur);

}
