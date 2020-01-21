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
public class DieRollMulti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int die = 0, nbJet = 0, nbPlayer = 0;

		while (nbPlayer <= 0 || nbPlayer>6) {
			System.out.println("How many players ? (max 6)");
//		nbPlayer = sc.nextInt();      ---------------------------------> ignore request pseudo player 1 !!!! fix with Integer.parseInt(sc.nextLine())
			nbPlayer = Integer.parseInt(sc.nextLine());
		}

		String pseudo[] = new String[nbPlayer];
		int score[] = new int[nbPlayer];

		for (int i = 0; i < nbPlayer; i++) {
			System.out.println("\nPlayer " + (i + 1) + ", please enter your pseudo :");
			pseudo[i] = sc.nextLine();
//			System.out.println("Player " + (i + 1) + ", your pseudo is : " + pseudo[i]);
		}

		for (int i = 0; i < pseudo.length; i++) {

			System.out.println("\n" + pseudo[i] + ", please roll the die :");

			while (nbJet < 3) {

				nbJet++;
				die = new Random().nextInt(7);
				if (die > 0) {
					System.out.println("Die roll : " + die);
				}
				score[i] = score[i] + die;
				if (die == 6 || die == 0) {
					nbJet--;
					if (die == 6) {
						System.out.println("'------------> Roll Again !");
					}
				}
			}

			System.out.println(pseudo[i] + "'s score : " + score[i]);

			nbJet = 0;
			die = 0;

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
