package com.crm.app;

import java.util.Scanner;

/**
 * afficher si le nombre saisi est pair ou impair grace au modulo (modulo de la division par deux = 0 : pair, sinon (=1) : impair)
 * avec relancement du programme
 * @author Joanna
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
				System.out.println("This number is even");
			} else {
				System.out.println("This number is odd");
			}

			System.out.println("\nDo you want try with an another number ? (yes/no)");
			answer = sc.next();
		}
		System.out.println("Closed program");
		sc.close();
	}
}
