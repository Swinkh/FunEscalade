package com.jonathanweb.funescalade.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COMMENTAIRE")
public class Commentaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String commentaire;
	
	@ManyToOne
	private Topo topo;
	
	
	
	

	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String comment) {
		this.commentaire = comment;
	}
	

	public synchronized int getId() {
		return id;
	}

	public synchronized void setId(int id) {
		this.id = id;
	}

	public synchronized Topo getTopo() {
		return topo;
	}

	public synchronized void setTopo(Topo topo) {
		this.topo = topo;
	}
}
