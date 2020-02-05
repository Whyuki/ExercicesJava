/**
 * avec interraction user
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Rectangle;

/**
 * @author Joanna
 *
 */
public class RectangleApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Rectangle rect1 = new Rectangle();
		rect1.setName("First rectangle");
		Rectangle rect2 = new Rectangle();
		rect2.setName("Second rectangle");

		System.out.println("length of first rectangle ?");
		rect1.setLength(sc.nextFloat());
		System.out.println("his width ?");
		rect1.setWidth(sc.nextFloat());

		System.out.println("\nlength of second rectangle ?");
		rect2.setLength(sc.nextFloat());
		System.out.println("his width ?");
		rect2.setWidth(sc.nextFloat());
		
		
		rect1.showDetails();
		rect2.showDetails();

		rect1.compareRectangle(rect2);

		sc.close();
	}

}
