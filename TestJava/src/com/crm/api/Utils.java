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

	
	// calcul la somme de deux float
	public static float somme(float a, float b) {

		float s = (float) a + (float) b;
		return s;
	}

	
	// calcul perimtre d'un rectangle avec longueur et largeur en parametre
	public static float perimeterRectangle(float length, float width) {
		float perim = Utils.somme(length, width) * 2;
		return perim;
	}
	
	// calcul l'aire d'un carré avec coté en parametre
	public static float squareArea(float side) {
		float squareArea = (float) side * 4;
		return squareArea;

	}
	// calcul l'aire d'un cercle avec le rayon en parametre
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
	
	// méthode permettant de parcourir un tableau deux dimension et afficher chaque éléments
	public static void parcoursTableau2dim(String[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("élément [" + i + "][" + j + "] : " + array[i][j]);
			}
			System.out.println();
		}
	}
	// méthode permettant de chercher dans un tableau deux dimensions de string le contenu et retourne l'indice correspondant
	public static int foundIndex(String[][] array, String str, int indiceTab) {
		int ind = -1;
		for (int j = 0; j < array[indiceTab].length; j++) {
			if (str.equalsIgnoreCase(array[indiceTab][j])) {
				ind = j;
				break;
			}
		}
		return ind;
	}
}
