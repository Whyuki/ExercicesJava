/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author Joanna
 *
 */
public class LectureClavierTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;									// en une ligne : Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot :");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : " + str);
		sc.close();
	}

}
