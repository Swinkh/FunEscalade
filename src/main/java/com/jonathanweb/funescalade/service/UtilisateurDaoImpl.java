package com.jonathanweb.funescalade.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;

import com.jonathanweb.funescalade.model.Utilisateur;



@Service
public class UtilisateurDaoImpl implements UtilisateurDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Utilisateur find(String username) {
		TypedQuery<Utilisateur> query = entityManager.createQuery("select u from Utilisateur u where u.username = :username", Utilisateur.class);
		query.setParameter("username", username);
		return query.getSingleResult();
	}
}
