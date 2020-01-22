import java.util.Scanner;

/**
 * 
 */

/**
 * @author Joanna
 *
 */
/** 
 * résultat examen
 */
public class Examen {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int note;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre note :");
		note = sc.nextInt();

		if (note >= 16) {
			System.out.println("Vous êtes admis avec la mention TB");

		} else if (note >= 14) {
			System.out.println("Vous êtes admis avec la mention B");

		} else if (note >= 12) {
			System.out.println("Vous êtes admis avec la mention AB");

		} else if (note >= 10) {
			System.out.println("Vous êtes admis");

		} else if (note >= 8 && note < 10) {
			System.out.println("Vous êtes éligible au rattrapage");

		} else {
			System.out.println("Vous êtes ajourné");
		}

		sc.close();
	}
}
