package com.crm.bo;

/**
 * @author Joanna
 *
 */

public class Film {

	// attributs (titre et classification)
	private String titre;
	private String classif;
	private String type;

	// méthode (get, set et afficher détails)

	public void setTitre(String t) {
		titre = t;
	}

	public String getTitre() {
		return titre;
	}

	public void setClassif(String cl) {
		classif = cl;
	}

	public String getClassif() {
		return classif;
	}

	public void setType(String ty) {
		type = ty;
	}

	public String getType() {
		return type;
	}

	public void afficherDetails() {
		System.out.println(titre + ", " + type + " : " + classif);
	}

}
