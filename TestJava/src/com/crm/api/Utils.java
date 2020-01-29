/**
 * 
 */
package com.crm.api;

/**
 * @author Joanna
 *
 */
public class Utils {

	// declaration d'une constance MY_PI
	public static final double MY_PI = Math.PI;

	// déclaration constante de type string
	public static final String COLOR_BLUE = "blue";

	public static float somme(float a, float b) {

		float s = (float) a + (float) b;
		return s;
	}

	public static float perimeterRectangle(float length, float width) {
		float perim = Utils.somme(length, width) * 2;
		return perim;
	}

	public static float squareArea(float side) {
		float squareArea = (float) side * 4;
		return squareArea;

	}

	public static double circleArea(int r) {

		// calcul de l'aire
		double a = r * r * MY_PI;
		return a;
	}

	public static double circleAreaV2(int r) {

		// utilisation de la class Math pour la formule
		double a = Math.pow(r, 2) * Math.PI;
		return a;
	}

	public static void afficherMessage(String texte) {
		System.out.println(texte);
	}

	public static void parcoursTableau2dim(String[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("élément [" + i + "][" + j + "] : " + array[i][j]);
			}
			System.out.println();
		}
	}

	public static int foundInd(String[][] array, String str) {
		int ind = -1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (str.equalsIgnoreCase(array[i][j])) {
					ind = j;
					break;
				}
			}
		}
		return ind;
	}
}
