package com.crm.boapp;

import com.crm.bo.Rectangle;

/**
 * sans interraction user
 * @author Joanna
 *
 */
public class RectangleApp0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rect1 = new Rectangle("first rectangle", 11, 13);
		rect1.perimeter("cm");
		rect1.area("cm²");
		rect1.showDetails();
		System.out.println();
		Rectangle rect2 = new Rectangle("second rectangle", 11, 13);
		rect2.perimeter("cm");
		rect2.area("cm²");
		rect2.showDetails();

		rect1.compareRectangle(rect2); // return void avec affichage 

		if (rect1.isBiggerThan(rect2) == true) { // return boolean
			System.out.println("The " + rect1.getName() + " is the biggest !");
		} else if (rect2.isBiggerThan(rect1) == true) {
			System.out.println(("The " + rect2.getName() + " is the biggest ! "));
		} else {
			System.out.println("\nThey are equal !");
		}

	}

}
