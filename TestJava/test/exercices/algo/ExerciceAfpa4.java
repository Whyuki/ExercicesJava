package exercices.algo;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class ExerciceAfpa4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y, resultat;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre :");
		x = sc.nextInt();
		System.out.println("Veuillez saisir son exposant :");
		y = sc.nextInt();
		resultat = Math.pow(x, y);
		System.out.println("résulat : " + resultat);
		sc.close();
	}

}
