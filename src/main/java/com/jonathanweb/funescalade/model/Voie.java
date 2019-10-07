package com.jonathanweb.funescalade.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VOIE")
public class Voie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int height;
	
	private String cotation;
	
	private int nbPoint;
	
	private String name;
	
	private int secteur_ID;
		
	

	public Voie(){
		
	}
	
	public Voie(String nom, int hauteur, String cotation, int nbPoint,int sectID) {
	this.name = nom;
	this.height = hauteur;
	this.cotation = cotation;
	this.nbPoint=nbPoint;
	this.secteur_ID=sectID;
	
			
	}
	
	public int getSecteur_ID() {
		return secteur_ID;
	}

	public void setSecteur_ID(int secteur_ID) {
		this.secteur_ID = secteur_ID;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int hauteur) {
		this.height = hauteur;
	}
	public String getCotation() {
		return cotation;
	}
	public void setCotation(String cotation) {
		this.cotation = cotation;
	}
	public int getNbPoint() {
		return nbPoint;
	}
	public void setNbPoint(int nbPoint) {
		this.nbPoint = nbPoint;
	}
	public String getName() {
		return name;
	}
	public void setName(String nom) {
		this.name = nom;
	}
	public synchronized int getId() {
		return id;
	}

	public synchronized void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Voie [name=" + name + ", height=" + height + ",cotation=" + cotation + ", nbPoint=" + nbPoint + "]";
	}
	
}
