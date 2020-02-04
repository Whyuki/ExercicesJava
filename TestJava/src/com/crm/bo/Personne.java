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
	 */
	public void setPrenom(String p) {
		prenom = p;
	}

	/**
	 * Cette méthode affiche les détails
	 */
	public void afficherDetails() {
		System.out.println("Bonjour " + prenom + " " + nom + "( " + surnom + " pour les intimes ;D ).");
	}
	
	
	/**
	 * Cette méthode (public static) affiche les détails avec un for each
	 */
	
	public static void affDet(Personne[] perTab) {
		for(Personne per : perTab ) {
			System.out.println("Prenom : "+per.prenom);
			System.out.println("Nom : "+per.nom);
			System.out.println("Surnom : "+per.surnom);
		}
	}
	
	/**
	 * Cette méthode (public static) affiche les détails avec un for 
	 */

	public static void afficherResume(Personne[] perTab) {
		for (int i = 0; i < perTab.length; i++) {
			System.out.println("\n Résumé :" + "\n" + (i + 1) + ")" + "\nPrénom : " + perTab[i].prenom + "\nNom : "
					+ perTab[i].nom + "\nSurnom : " + perTab[i].surnom + "\n");
		}
	}

}
