/**
 * 
 */
package com.crm.formation;

import java.util.Random;
import java.util.Scanner;

/**
 * @author joann
 *
 */
public class HasNextTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0, devi = 0, nbTentative = 0;
		int r = new Random().nextInt(101);
		Scanner sc = new Scanner(System.in);
		devi = r;
		System.out.println("Veuillez saisir un nombre compris entre 0 et 100 :");
		while (n != devi) {
//			System.out.println(sc.hasNextInt());
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				nbTentative++;
				if (n > 100) {
					System.out.println("Nombre suppérieur à 100, réessayez : ");
				} else if (n < 0) {
					System.out.println("Nombre inférieur à 0, réessayez : ");
				} else if (n == devi) {
					System.out.println("Le bon nombre est bien " + devi);
					if (nbTentative < 2) {
						System.out.println("Vous l'avez trouvé en " + nbTentative + " essai");
					} else {
						System.out.println("Vous l'avez trouvé en " + nbTentative + " essais");
					}
				} else if (n > devi) {
					System.out.println("C'est moins, réessayez :");
				} else {
					System.out.println("C'est plus, réessayez :");
				}
			} else {
				sc.next();
				System.out.println("Ceci n'est pas un nombre ! Réessayez :");
			}
		}

		sc.close();
	}
}