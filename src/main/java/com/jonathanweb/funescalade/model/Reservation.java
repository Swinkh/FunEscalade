package com.jonathanweb.funescalade.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RESERVATION")
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int numeroReservation;
	
	private int user_id;
	
	private int topo_id;
	
	
	public Reservation() {
		
	}
	public Reservation(int numRes,int user_id,int topo_id) {
		this.numeroReservation =numRes;
		this.user_id =user_id;
		this.topo_id =topo_id ;
			}
	
	
	public  int getUser_id() {
		return user_id;
	}

	public  void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public  int getTopo_id() {
		return topo_id;
	}

	public  void setTopo_id(int topo_id) {
		this.topo_id = topo_id;
	}

	

	public int getNumeroReservation() {
		return numeroReservation;
	}

	public void setNumeroReservation(int numeroReservation) {
		this.numeroReservation = numeroReservation;
	}

	
	
	

}
