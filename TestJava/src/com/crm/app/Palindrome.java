package com.crm.app;

import java.util.Scanner;

/**
 * @author Joanna
 */
/** 
 * afficher si le mot saisi est un palindrome (identique à l'envers ex: kawak)
 * 
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String motSaisi = "", motInverse = "";
		char c;

		System.out.println("Veuillez saisir un mot : ");
		motSaisi = sc.nextLine();

		for (int i = motSaisi.toCharArray().length - 1; i >= 0; i--) {
			c = motSaisi.charAt(i);
			motInverse = motInverse + c;

		}

		if (motSaisi.equals(motInverse)) {
			System.out.println("Ce mot est un palindrome");
		} else {
			System.out.println("Ce mot n'est pas un palindrome");
		}

		sc.close();
	}

}
