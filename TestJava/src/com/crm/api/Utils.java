/**
 * 
 */
package com.crm.api;

/**
 * @author CRM
 *
 */
public class Utils {

	public static float somme(float a, float b) {

		float s = (float) a + (float) b;
		return s;
	}

	public static float perimeterRectangle(float length, float width) {
		float perim = Utils.somme(length, width) * 2f;
		return perim;
	}
}
