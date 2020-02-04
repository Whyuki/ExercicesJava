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

	// getters & setters : right clic > source > generate

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

	/**
	 * Cette méthode affiche les détails
	 */
	public void afficherDetails() {
		System.out.println("Bonjour " + prenom + " " + nom + "( " + surnom + " pour les intimes ;D ).");
	}

	/**
	 * Cette méthode (public static) affiche les détails avec une boucle for each
	 */

	public static void affDet(Personne[] perTab) {
		for (Personne per : perTab) {
			System.out.println(per.surnom + " (" + per.prenom + " " + per.nom + ")");
		}
	}

	/**
	 * Cette méthode (public static) affiche les détails avec une boucle for
	 */

	public static void afficherResume(Personne[] perTab) {
		for (int i = 0; i < perTab.length; i++) {
			System.out.println("\nPrenom : " + perTab[i].prenom);
			System.out.println("Nom : " + perTab[i].nom);
			System.out.println("Surnom : " + perTab[i].surnom);
		}
	}

}
