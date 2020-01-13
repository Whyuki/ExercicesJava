import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class Examen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int note;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your note :");
		note = sc.nextInt();
		if (note >= 16) {
			System.out.println("mention TB");
		} else if (note >= 14) {
			System.out.println("mention B");

		}
		else if (note >= 12) {
			System.out.println("mention AB");

		}
		else if (note >= 10) {
			System.out.println("admis");

		}
		else if (note >= 8 && note < 10) {
			System.out.println("rattrapage");

		} else {
			System.out.println("rip");
		}

	}

}
