/**
 * 
 */
package com.crm.api;

import java.util.Random;
import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class DieRollArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dice = 0, nbJet = 0, nbPlayer;

		System.out.println("How many players ?");
		nbPlayer = sc.nextInt();

		String pseudo[] = new String[nbPlayer];
		int score[] = new int[nbPlayer];

		for (int i = 0; i < nbPlayer; i++) {

			System.out.println("Player " + (i + 1) + ", please enter your pseudo :");
			pseudo[i] = sc.nextLine();
			System.out.println("pseudo :" + pseudo[i]);
		}

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
