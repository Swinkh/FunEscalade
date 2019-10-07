package com.jonathanweb.funescalade.service;

import com.jonathanweb.funescalade.model.Utilisateur;

public interface UtilisateurDao {
	public Utilisateur find( String username);
}
