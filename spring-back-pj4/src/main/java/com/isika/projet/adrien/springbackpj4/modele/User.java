package com.isika.projet.adrien.springbackpj4.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Integer id;
	
	private String nom;
	
	private Number membresFamille;
	
	private Number teletravail;

	public User(Integer id, String nom, Number membresFamille, Number teletravail) {
		super();
		this.id = id;
		this.nom = nom;
		this.membresFamille = membresFamille;
		this.teletravail = teletravail;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Number getMembresFamille() {
		return membresFamille;
	}

	public void setMembresFamille(Number membresFamille) {
		this.membresFamille = membresFamille;
	}

	public Number getTeletravail() {
		return teletravail;
	}

	public void setTeletravail(Number teletravail) {
		this.teletravail = teletravail;
	}

}
