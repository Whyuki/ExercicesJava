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
		// TODO idée nombre de tentative max ? game over ?
		int n = 0, devi = 64, i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre compris entre 0 et 100 :");
		while (n != devi) {
			n = sc.nextInt();
			i++;
			if (n > 100) {
				System.out.println("Nombre suppérieur à 100, réessayez : ");
			} else if (n < 0) {
				System.out.println("Nombre inférieur à 0, réessayez : ");
			} else if (n == devi) {
				System.out.println("Le bon nombre est bien " + devi);
				if (i < 2) {
					System.out.println("Vous l'avez trouvé en " + i + " essai");
				} else {
					System.out.println("Vous l'avez trouvé en " + i + " essais");
				}
			} else if (n > devi) {
				System.out.println("C'est moins, réessayez :");
			} else {
				System.out.println("C'est plus, réessayez :");
			}
		}
		sc.close();
	}
}
