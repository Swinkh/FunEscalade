package com.jonathanweb.funescalade.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "SITE")
public class Site {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Utilisateur utilisateur;
	
	private String nom;
	
	private ArrayList <Secteur> secteur;
	
	private int topo_id;
	
	public Site() {
		
	}
	
	public Site( String nom, int id) {
		this.nom=nom;
		this.topo_id=id;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Secteur> getSecteur() {
		return secteur;
	}
	public void setSecteur(ArrayList<Secteur> secteur) {
		this.secteur = secteur;
	}
	public int getTopo_id() {
		return topo_id;
	}
	public void setTopo_id(int topo_id) {
		this.topo_id = topo_id;
	}

	public synchronized int getId() {
		return id;
	}

	public synchronized void setId(int id) {
		this.id = id;
	}

	public synchronized Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public synchronized void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
}
