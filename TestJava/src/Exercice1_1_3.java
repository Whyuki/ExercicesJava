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
		// TODO Auto-generated method stub
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
		rep = true;
		while (nombre > 0) {
			System.out.println("Veuillez saisir un autre nombre :");
			nombre = sc.nextInt();
			somme = somme + nombre;
			compteurDeNombre++;
			moyenne = (float) somme / (float) compteurDeNombre;
			System.out.println(compteurDeNombre + " nombres saisis");
			System.out.println("moyenne : " + moyenne+"\n");
			System.out.println("somme : " + somme+"\n");
				}
		sc.close();
	}
}