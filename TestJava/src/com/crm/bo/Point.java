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

	public Point(int abcisse, int ordonne) {
		this.abcisse = abcisse;
		this.ordonnee = ordonne;
	}

	public float getAbcisse() {
		return abcisse;
	}

	public void setAbcisse(int abcisse) {
		this.abcisse = abcisse;
	}

	public float getOrdonne() {
		return ordonnee;
	}

	public void setOrdonne(int ordonne) {
		this.ordonnee = ordonne;
	}

	public float distance(Point p) {
		float distance;
		distance = (float) Math
				.sqrt(Math.pow((this.abcisse - p.abcisse), 2) + Math.pow((this.ordonnee - p.ordonnee), 2));
		return distance;
	}
}
