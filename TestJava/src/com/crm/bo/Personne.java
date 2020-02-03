/**
 * 
 */
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
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	
	
	/**
	 * Cette méthode modifie la valeur de l'atribut nom
	 * 
	 * @return n nouveau nom
	 */
	public void setNom(String n) {
		nom = n;
	}
	
}
