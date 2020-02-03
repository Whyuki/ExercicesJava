package afpa.exercices.algo;
import java.util.Scanner;

/**
 * @author Joanna
 * 
 * calcul la somme des nombres entre 0 et le nombre saisi
 *
 */
public class ExerciceAfpa1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO possibilité sans i : n--
		int n, i = 0, somme = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre :");
		n = sc.nextInt();

		while (i <= n) {
			somme = somme + i;
			i++;
		}
		System.out.println("Boucle WHILE :" + "\nLa somme des nombres de 0 à " + n + " est de " + somme);
		somme = 0;
		i = 0;

		do {
			somme = somme + i;
			i++;
		} while (i <= n);
		System.out.println("\nBoucle DO..WHILE :" + "\nLa somme des nombres de 0 à " + n + " est de " + somme);
		somme = 0;
		i = 0;

		for (i = 0; i <= n; i++) {
			somme = somme + i;
		}

		System.out.println("\nBoucle FOR :" + "\nLa somme des nombres de 0 à " + n + " est de " + somme);
		sc.close();
	}

}
