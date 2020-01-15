import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class DevineUnNombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0, devi = 64;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre compris entre 0 et 100 :");
		while (n >= 0 && n <= 100) {
			n = sc.nextInt();
			if (n == devi) {
				System.out.println("Le bon nombre est bien " + devi);
			} else if (n > devi) {
				System.out.println("C'est moins, réessayez :");
			} else {
				System.out.println("C'est plus, réessayez :");
			}

		}
		sc.close();


	}
}