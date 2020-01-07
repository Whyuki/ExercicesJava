/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

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
		

		Scanner sc;
		sc = new Scanner(System.in);
		float lengthRectangle, widthRectangle, perimeterRectangle;
		System.out.println("To calculate the perimeter, please enter the length of the rectangle : ");
		lengthRectangle = sc.nextFloat();
		System.out.println("and now, please enter its width :");
		widthRectangle = sc.nextFloat();
		perimeterRectangle = MethodTest.perimeterRectangle(lengthRectangle,widthRectangle);
		System.out.println("Length : "+lengthRectangle+"cm \nWidth : "+widthRectangle+"cm \nPerimeter : "+perimeterRectangle+"cm");
		sc.close();
	}

	public static int somme(int a, int b) { // déclaration methode somme, parametre entrée deux entier a et b, renvoit
											// int

		int s = a + b;
		return s;
	}

	public static float perimeterRectangle(float length, float width) {
		float perim = (length + width) * 2f;
		return perim;
	}

}
