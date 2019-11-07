package com.jonathanweb.funescalade.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jonathanweb.funescalade.model.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur,String> {
	List<Utilisateur> findByUsername (String username);
	
	Optional<Utilisateur>  findByUsernameAndPassword(String username,String password); 
	                   
}
