/**
 * 
 */
package com.crm.api;

/**
 * @author CRM
 *
 */
public class Utils {
	
	//declaration d'une constance PI
	public static final float PI  = 3.14f;

	// déclaration constante de type string 
	public static final String COLOR_BLUE="blue";

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

	public static float circleArea(int r) {

		// calcul de l'aire
		float a = r * r * PI;
 
		return a;
	}

	public static void afficherMessage(String texte) {
		System.out.println(texte);
	}

	
}
