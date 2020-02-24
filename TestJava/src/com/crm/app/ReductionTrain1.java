package com.crm.app;

import java.util.Scanner;

/**
 * @author Joanna
 */
/**
 * Afficher la réduction (potentielle) correspondante à l'âge saisi par l'utilisateur
 * méthode if else if...
 */
public class ReductionTrain1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0, reduc = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est votre age ?");
		age = sc.nextInt();
		if (age < 0) {
			System.out.println("âge incorrect");
		} else if (age >= 50) {
			reduc = 30;
			System.out.println("Vous bénéficiez d'une réduction de " + reduc + "%.");
		} else if (age > 15 && age < 26) {
			reduc = 25;
			System.out.println("Vous bénéficiez d'une réduction de " + reduc + "%.");
		} else if (age <= 15) {
			reduc = 50;
			System.out.println("Vous bénéficiez d'une réduction de " + reduc + "%.");
		} else  {
			System.out.println("Vous ne bénéficiez d'aucune réduction");
		}
		sc.close();
	}

}
