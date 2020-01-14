/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class ReductionTrain2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0, reduc = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est votre age ?");
		age = sc.nextInt();
		if (age > 0) {
			if (age >= 15) {
				if (age >= 25) {
					if (age >= 50) {
						reduc = 30;
						System.out.println("Vous bénéficiez d'une réduction de " + reduc + "%.");
					} else {
						System.out.println("Vous ne bénéficiez d'aucune réduction.");
					}
				} else {
					reduc = 25;
					System.out.println("Vous bénéficiez d'une réduction de " + reduc + "%.");
				}
			} else {
				reduc = 50;
				System.out.println("Vous bénéficiez d'une réduction de " + reduc + "%.");
			}
		} else {
			System.out.println("Âge incorrect");
		}

		sc.close();
	}

}
