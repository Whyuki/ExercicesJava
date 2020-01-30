package dev.abc.janvier.eval;

import java.util.Scanner;

/**
 * @author Joanna
 *
 */
public class StructuresRépétitives1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbStart = 0, nbEnd = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Veuillez saisir un nombre de départ :");
			nbStart = sc.nextInt();
			System.out.println("Veuillez saisir un nombre de fin :");
			nbEnd = sc.nextInt();
			if (nbStart < nbEnd) {
				System.out.println("Valeurs intermédiaires :");
				for (int i = nbStart; i <= nbEnd; i += 2) {
					System.out.println(i);
				}
			} else {
				System.out.println("Le nombre de départ doit être inférieur au nombre de fin !");
			}
		} while (nbStart > nbEnd);
		sc.close();
	}
}