/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class MethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb1 = 2;
		int nb2 = 3;
		int s = MethodTest.somme(nb1, nb2); 
		System.out.println(s);
		int nb3 = 7;
		int nb4 = 4;
		int s2 = MethodTest.somme(nb3, nb4);
		System.out.println(s2);
	}

	public static int somme(int a, int b) { // déclaration methode somme, parametre entrée deux entier a et b, renvoit
											// int

		int s = a + b;
		return s;
	}

	public static float perimeterRectangle(float length, float width) {
		float perim = (length + width)*2;
		return perim;
	}
	
}
