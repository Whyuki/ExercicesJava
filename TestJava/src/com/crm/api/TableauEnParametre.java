/**
 * 
 */
package com.crm.api;

/**
 * @author Joanna
 *
 */
public class TableauEnParametre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tablow = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		afficherTableau(tablow);
	}

	public static void afficherTableau(int[] tabInt) {
		for (int nb : tabInt) {
			System.out.println(nb);
		}
	}

}
