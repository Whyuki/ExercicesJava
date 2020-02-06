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

	// constructor
	public Personne() {
		nom = "";
		prenom = "";
		surnom = "";
		System.out.println("Constuction d'un objet Personne (sans paramètres) :");
	}

	public Personne(String surnom, String nom, String prenom) {
		this.surnom = surnom;
		this.nom = nom;
		this.prenom = prenom;
		System.out.println("Constuction d'un objet Personne avec paramètres (surnom, nom, prénom) :");

	}

	// getters/setters : right clic > source > generate

	/**
	 * Cette méthode renvoie la valeur de l'attribut nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Cette méthode modifie la valeur de l'attribut nom
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Cette méthode renvoie valeur attribut prenom
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Cette méthode modifie la valeur de l'attribut prenom
	 * 
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	// méthodes

	/**
	 * Cette méthode affiche les détails
	 */
	public void afficherDetails() {
		System.out.println("Bonjour " + prenom + " " + nom + "( " + surnom + " pour les intimes ;D ).");
	}

}
