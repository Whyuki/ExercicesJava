/**
 * sans interraction user
 */
package com.crm.boapp;

import com.crm.bo.Rectangle;

/**
 * @author Joanna
 *
 */
public class RectangleApp0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rect1 = new Rectangle("first rectangle", 7, 4);
		rect1.perimeter("cm");
		rect1.area("cm²");
//		rect1.showDetails();
		System.out.println();
		Rectangle rect2 = new Rectangle("second rectangle", 1, 3);
		rect2.perimeter("cm");
		rect2.area("cm²");
//		rect2.showDetails();

		rect1.compareRectangle(rect2);

	}

}
