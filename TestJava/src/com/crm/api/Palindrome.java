/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String answer;
		boolean palindrome = false;

		System.out.println("Veuillez saisir un mot : ");
		answer = sc.nextLine();

		for (int i = 0, j = answer.toCharArray().length - 1; i < j; i++, j--) {
//			System.out.println(i);
//			System.out.println(j);
			if (answer.charAt(i) != answer.charAt(j)) {
				System.out.println("Ce mot n'est pas un palindrome");
				palindrome = false;
				break;
//			System.out.println(answer.charAt(i));
//			System.out.println(answer.charAt(j));
//				
			} else {
				palindrome = true;
				continue;
				
			}

		}
		if (palindrome == true) {
			System.out.println("Ce mot est un palindrome.");
		}

		sc.close();
	}

}
