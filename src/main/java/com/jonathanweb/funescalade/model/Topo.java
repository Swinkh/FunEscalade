package com.jonathanweb.funescalade.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "TOPO")
public class Topo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	
	private String description;
	
	private Date dateDeCreation;
	
	@OneToMany(mappedBy = "topo")
	private List<Commentaire>commentaire;
	
	
	
	public synchronized List<Commentaire> getComm() {
		return commentaire;
	}

	public synchronized void setComm(List<Commentaire> comm) {
		this.commentaire = comm;
	}

	@Enumerated(EnumType.STRING)
	private Etat etat;
	
	public Topo() {
		
	}
	
	public Topo ( String nom, String description,Date date) {
		this.name=nom;
		this.description = description;
		this.dateDeCreation=date;
	}
	
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	public String getName() {
		return name;
	}
	public void setName(String nom) {
		this.name = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateDeCreation() {
		return dateDeCreation;
	}
	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}
	

	public synchronized int getId() {
		return id;
	}

	public synchronized void setId(int id) {
		this.id = id;
	}
	
	
	
}
