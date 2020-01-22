/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author Joanna
 *
 */
public class PalindromeTest {

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
			if (answer.charAt(i) != answer.charAt(j)) {
				System.out.println("Ce mot n'est pas un palindrome");
				palindrome = false;
				break;
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
