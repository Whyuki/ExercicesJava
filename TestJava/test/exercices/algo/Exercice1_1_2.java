package exercices.algo;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class Exercice1_1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int premierNombre, secondNombre;
		float moyenne;
		boolean réponse;
		Scanner sc;
		sc = new Scanner(System.in);
		réponse = true;
		while (réponse == true) {
			System.out.println("Veuillez saisir un premier nombre :");
			premierNombre = sc.nextInt();
			System.out.println("Veuillez saisir un second nombre :");
			secondNombre = sc.nextInt();
			moyenne = (premierNombre + secondNombre) / 2f;
			System.out.println("La moyenne de ces deux nombres est de : " + moyenne);
			System.out.println("Souhaitez vous faire un autre calcul ? si oui tapez 'true', sinon: tapez 'false'");
			réponse = sc.nextBoolean();
		}
		sc.close();
	}

}
