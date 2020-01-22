/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author Joanna
 *
 */
public class HasNextTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;

		Scanner sc = new Scanner(System.in);

		if (sc.hasNextInt()) {
			n = sc.nextInt();
			System.out.println("ok " + n);

		} else {
			sc.next();
			System.out.println("rip ");
		}

		sc.close();
	}
}