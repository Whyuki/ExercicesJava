package dev.abc.janvier.eval;

import java.util.Scanner;

/**
 * @author Joanna
 *
 */
public class StructuresRépétitives2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nbStart = 0, nbEnd = 0, i=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Veuillez saisir un nombre de départ :");
			nbStart = sc.nextInt();
			System.out.println("Veuillez saisir un nombre de fin :");
			nbEnd = sc.nextInt();
			if (nbStart < nbEnd) {
				System.out.println("Valeurs intermédiaires :");
				i= nbStart; //utilisation de i pour conserver le do while
				do {
					System.out.println(i);
					i += 2;
				} while (i <= nbEnd);
			} else {
				System.out.println("Le nombre de départ doit être inférieur au nombre de fin !");
			}
		} while (nbStart > nbEnd);
		sc.close();
	}

}
