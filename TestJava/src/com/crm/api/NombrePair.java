package com.crm.api;

import java.util.Scanner;

/**
 * @author Joanna
 * 
 * afficher si le nombre saisi est pair ou impair grace au modulo (modulo de la division par deux = 0 : pair, sinon (=1) : impair)
 */
public class NombrePair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("This number is even");
		} else {
			System.out.println("This number is odd");
		}
		System.out.println("\nPlease enter an another number");
		number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("This number is even");
		} else {
			System.out.println("This number is odd");
		}
		sc.close();
	}

}
