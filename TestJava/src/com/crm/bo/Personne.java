package com.crm.bo;

import java.util.Date;

/**
 * @author Joanna
 *
 */

public class Personne {

	// attributs
	public String surnom;
	private String nom;
	private String prenom;
	protected Date dateDeNaissance;

	// méthodes

	/**
	 * Cette méthode renvoie la valeur de l'attribut nom
	 * 
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Cette méthode modifie la valeur de l'attribut nom
	 * 
	 */
	public void setNom(String n) {
		nom = n;
	}

	/**
	 * Cette méthode renvoie valeur attribut prenom
	 * 
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Cette méthode modifie la valeur de l'attribut prenom
	 * 
	 */
	public void setPrenom(String p) {
		prenom = p;
	}

	public void afficherDetails() {
		System.out.println("Détails :");
		System.out.println("Nom : " + nom);
		System.out.println("Prénom : " + prenom);
		System.out.println("Surnom : " + surnom);
//		System.out.println("Date de naissance :" + dateDeNaissance);
	}

}
