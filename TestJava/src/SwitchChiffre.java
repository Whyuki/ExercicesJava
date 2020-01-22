import java.util.Scanner;

/**
 * 
 */

/**
 * @author Joanna
 *
 */
public class SwitchChiffre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chiffre = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un chiffre svp");
		chiffre = sc.nextInt();
		switch (chiffre) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Vous avez saisi le chiffre " + chiffre);
			break;

		default:
			System.out.println("Ceci n'est pas un chiffre");
			break;
		}
		sc.close();
	}

}
