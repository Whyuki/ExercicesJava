import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class ExerciceAfpa1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
