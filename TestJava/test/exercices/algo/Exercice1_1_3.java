package exercices.algo;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class Exercice1_1_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO seulement additionner et calculer la moyenne qu'à la fin ?
		int nombre, compteurDeNombre, somme;
		float moyenne;
		boolean rep;
		Scanner sc;
		sc = new Scanner(System.in);
		compteurDeNombre = 0;
		somme = 0;
		nombre = 0;
		System.out.println("Veuillez saisir un nombre :");
		nombre = sc.nextInt();
		somme = somme + nombre;
		compteurDeNombre++;
		moyenne = (float) somme / (float) compteurDeNombre;
		rep = true;
		while (rep == true) {
			System.out.println("Veuillez saisir un autre nombre :");
			nombre = sc.nextInt();
			if (nombre != 0) {
				rep = true;
				compteurDeNombre++;
				somme = somme + nombre;
				moyenne = (float) somme / (float) compteurDeNombre;
			}
				System.out.println("somme : " + somme);
				System.out.println(compteurDeNombre + " nombres saisis");
				System.out.println("moyenne : " + moyenne + "\n");
			
		}
		sc.close();
	}
}