package com.jonathanweb.funescalade.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathanweb.funescalade.model.Utilisateur;
import com.jonathanweb.funescalade.repository.UtilisateurRepository;

@Service
public class UtilisateurServiceImpl implements UtilisateurServices {
	
	@Autowired
	UtilisateurRepository utiliRepo;

	@Override
	public Optional<Utilisateur> findByUsernameAndPassword(String username, String password) {
		Optional<Utilisateur> user = utiliRepo.findByUsernameAndPassword(username, password);
		return user;
	}

}
