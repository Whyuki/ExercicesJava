import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Joanna
 *
 */
public class DevineUnNombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO idée nombre de tentative max ? game over ?
		// TODO fix nombre de tentative en cas de mauvaise saisie ?
				int n = 0, devi = 0, nbTentative = 0, fail =0;
				int r = new Random().nextInt(101);
				Scanner sc = new Scanner(System.in);
				devi = r;
				System.out.println("Veuillez saisir un nombre compris entre 0 et 100 :");
				while (n != devi) {
//					System.out.println(sc.hasNextInt());
					if (sc.hasNextInt()) {
						n = sc.nextInt();
						nbTentative++;
						if (n > 100) {
							System.out.println("Nombre suppérieur à 100, réessayez : ");
							fail++;
						} else if (n < 0) {
							System.out.println("Nombre inférieur à 0, réessayez : ");
							fail++;
						} else if (n == devi) {
							System.out.println("Le bon nombre est bien " + devi);
							if (nbTentative < 2) {
								System.out.println("Vous l'avez trouvé en " + nbTentative + " essai ( dont "+ fail +" erreur(s) de saisie)");
							} else {
								System.out.println("Vous l'avez trouvé en " + nbTentative + " essais ( dont "+ fail +" erreur(s) de saisie)");
							}
						} else if (n > devi) {
							System.out.println("C'est moins, réessayez :");
						} else {
							System.out.println("C'est plus, réessayez :");
						}
					} else {
						sc.next();
						fail++;
						nbTentative++;
						System.out.println("Ceci n'est pas un nombre ! Réessayez :");
					}
				}
				sc.close();
	}
}
