/**
 * 
 */
package com.crm.api;

import java.util.Random;
import java.util.Scanner;

/**
 * @author joann
 *
 */
public class Dice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String pseudo[] = new String[2];
		int score[] = new int[2];
		int dice = 0, nbJet = 0;

		System.out.println("Player 1, please enter your pseudo :");
		pseudo[0] = sc.nextLine();
		System.out.println("Player 2, please enter your pseudo :");
		pseudo[1] = sc.nextLine();

		for (int i = 0; i < pseudo.length; i++) {

			System.out.println("\n" + pseudo[i] + ", please roll the die :");

			while (nbJet < 3) {

				nbJet++;
				dice = new Random().nextInt(7);
				if (dice > 0) {
					System.out.println("Die roll : " + dice);
				}
				score[i] = score[i] + dice;
				if (dice == 6 || dice == 0) {
					nbJet--;
					if (dice == 6) {
						System.out.println("'------------> Roll Again !");
					}
				}
			}

			System.out.println(pseudo[i] + "'s score : " + score[i]);

			nbJet = 0;
			dice = 0;

		}

		if (score[0] > score[1]) {
			System.out.println("\n" + pseudo[0] + " win !");
		} else if (score[0] == score[1]) {
			System.out.println("=");
		} else {
			System.out.println("\n" + pseudo[1] + " win !");
		}
		sc.close();
	}

}
