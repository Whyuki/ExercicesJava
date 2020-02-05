/**
 * 
 */
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

		Point pointA = new Point(3, 4);
		Point pointB = new Point(5, 8);

		System.out.println("Distance entre le point a et le point b : " + pointA.distance(pointB));

	}

}
