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
//		System.out.println("Constuction d'un objet Personne (sans paramètres) :");
	}

	public Personne(String surnom, String nom, String prenom) {
		this.surnom = surnom;
		this.nom = nom;
		this.prenom = prenom;
//		System.out.println("Constuction d'un objet Personne avec paramètres (surnom, nom, prénom) :");

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

	public boolean isEquals(Personne pers) {
		if (this.prenom.equals(pers.prenom) && this.nom.equals(pers.nom)) {
			return true;
		}
		return false;
	}

	/**
	 * Cette méthode affiche les détails
	 */
	public void afficherDetails() {
		System.out.println("Bonjour " + prenom + " " + nom + "( " + surnom + " pour les intimes ;D ).");
	}

	public void afficherDetails(String langu) {
		switch (langu) {
		case "fr":
			System.out.println("Prénom : " + prenom + "\nNom : " + nom + "\nSurnom : " + surnom);
			break;
		case "en":
			System.out.println("Firstname : " + prenom + "\nLastname : " + nom + "\nNickname : " + surnom);
			break;
		case "de":
			System.out.println("Vorname : " + prenom + "\nNachname : " + nom + "\nSpitzname : " + surnom);
			break;
		default:
			break;
		}
	}

	public int incrementeNombre(int nb) { // param type primitif pour demontrer qu'une méthode avec un type primitif en
											// parametre ne modifie pas la valeur (ou variable) entrée en parametre (voir Personne
											// App0) contrairmeent aux objets en parametres (references)
		return nb++;
	}

	public static void modifierPersonne(Personne pers) {
		pers.nom = pers.nom.toUpperCase();
		pers.prenom = pers.prenom.toUpperCase();
	}

	public void majusc() {
		this.nom = this.nom.toUpperCase();
		this.prenom = this.prenom.toUpperCase();
	}
}
