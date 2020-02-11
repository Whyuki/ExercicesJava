/**
 * 
 */
package com.crm.bo;

/**
 * @author Joanna
 *
 */
public class Point {

	private float abcisse;
	private float ordonnee;

	public Point() {
	}

	public Point(float abcisse, float ordonne) {
		this.abcisse = abcisse;
		this.ordonnee = ordonne;
	}

	public float getAbcisse() {
		return abcisse;
	}

	public void setAbcisse(float abcisse) {
		this.abcisse = abcisse;
	}

	public float getOrdonne() {
		return ordonnee;
	}

	public void setOrdonne(float ordonne) {
		this.ordonnee = ordonne;
	}
	
	// affiché coordonnées d'un point
	public void afficherDetails() {
		System.out.println("Coordonnées : Abcisse : " + this.abcisse + " / Ordonnée : " + this.ordonnee);
	}

	
	/**
	 * afficher les détails de deux points (ceux de l'objet appelé et ceux de l'objet entré en parametre)
	 * 
	 * @param p
	 */
	public void afficherDetails(Point p) {
		System.out.println("Premier point :" + " Abcisse : " + this.abcisse + " / Ordonnée : " + this.ordonnee);
		System.out.println("Second point :" + " Abcisse : " + p.abcisse + " / Ordonnée : " + p.ordonnee);
	}

	// racine carré Math.sqrt
	public float distance(Point p) {
		return (float) Math.sqrt(Math.pow((this.abcisse - p.abcisse), 2) + Math.pow((this.ordonnee - p.ordonnee), 2));
	}
}
