package exercices.afpa;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class ExerciceAfpa2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, i = 1, produit = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre :");
		x = sc.nextInt();

		if (x >= 1) {

			while (i <= x) {
				produit = produit * i;
				i++;
			}
			System.out.println("Boucle WHILE :" + "\nLa factorielle de " + x + " est de " + produit);
			produit = 1;
			i = 1;

			do {
				produit = produit * i;
				i++;
			} while (i <= x);
			System.out.println("Boucle WHILE :" + "\nLa factorielle de " + x + " est de " + produit);
			produit = 1;
			i = 1;

			for (i = 1; i <= x; i++) {
				produit = produit * i;
			}

			System.out.println("Boucle WHILE :" + "\nLa factorielle de " + x + " est de " + produit);
			sc.close();

		} else {
			System.out.println("Calcul impossible");
		}
	}

}
