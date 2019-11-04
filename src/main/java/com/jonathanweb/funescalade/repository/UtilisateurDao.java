package com.jonathanweb.funescalade.repository;

import com.jonathanweb.funescalade.model.Utilisateur;

public interface UtilisateurDao {
	public Utilisateur find( String username);
}
