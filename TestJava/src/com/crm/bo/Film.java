package com.crm.bo;

/**
 * @author Joanna
 *
 */

public class Film {

	// attributs (titre et classification)
	private String titre;
	private String type;
	private String classif;

	// Constructor

	// Construction d'un objet Film avec paramètres (titre, type, classif)
	public Film(String titre, String type, String classif) {
		this.titre = titre;
		this.type = type;
		this.classif = classif;
	}

	// Construction d'un objet Film (sans paramètres)
	public Film() {
		titre = "unknow";
		type = "unknow";
		classif = "unknow";
	}

	
	// Getter / Setter
	public void setTitre(String t) {
		titre = t;
	}

	public String getTitre() {
		return titre;
	}

	public void setType(String ty) {
		type = ty;
	}

	public String getType() {
		return type;
	}

	public void setClassif(String cl) {
		classif = cl;
	}

	public String getClassif() {
		return classif;
	}
	
	// méthode 
	public void afficherDetails() {
		System.out.println(titre + ", " + type + " : " + classif);
	}

}
