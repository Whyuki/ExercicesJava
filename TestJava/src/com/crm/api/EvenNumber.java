/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		String answer = "yes";
		Scanner sc = new Scanner(System.in);
		while (answer.equals("yes")) {
			System.out.println("Please enter a number");
			number = sc.nextInt();
			if (number % 2 == 0) {
				System.out.println("This number is even\n");
			} else {
				System.out.println("This number is odd\n");
			}

//			System.out.println("\nDo you want try with an another number ? (yes/no)");
//			answer = sc.nextLine();
		}

		sc.close();
	}
}
