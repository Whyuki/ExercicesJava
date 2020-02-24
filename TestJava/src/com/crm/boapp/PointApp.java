package com.crm.boapp;

import com.crm.bo.Point;

/**
 * @author Joanna
 *
 */
public class PointApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// constructeur avec parametres
		Point pointA = new Point(3, 4);
		Point pointB = new Point(5, 8);

		// constructeur sans parametre
		Point pointC = new Point();
		System.out.println("Point C");

		// set
		pointC.setAbcisse(8);
		pointC.setOrdonne(5);
		pointC.afficherDetails();
		System.out.println();

		// get
		System.out.println("Abcisse Point A : " + pointA.getAbcisse());
		System.out.println("Ordonnee Point A : " + pointA.getOrdonne());
		System.out.println();

		pointA.afficherDetails(pointB);

		System.out.println("Distance entre ces deux points : " + pointA.distance(pointB));

	}

}
