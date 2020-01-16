import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class SwitchOrientation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO énumération à voir
		String choix = "ok";
		Scanner sc = new Scanner(System.in);
		final String CDA = "Concepteur Développeur d'Application", DWWM = " Développeur Web Web-Mobile", REORIENTATION = "réorentation professionnelle", EN_COURS_DE_REFLEXION = "en cours de réflexion";

		System.out.println("Veuillez choisir entre les propositions suivantes :" + " \n(C) : CDA ("+CDA+")" + "\n(D) : DWWM ("+DWWM+")"
				+ "\n(R) : Réorientation" + "\n(E) : En cours de réflexion ");
		choix = sc.nextLine();

		switch (choix) {
		case "C":
			System.out.println("Vous avez choisi de suivre la formation de "+CDA);
			break;
			
		case "D" :
			System.out.println("Vous avez choisi de suivre la formation de "+DWWM);
			break;
			
		case "R":
			System.out.println("Vous avez choisi de suivre une "+REORIENTATION);
			break;
			
		case "E":

			System.out.println("Vous avez déclaré être "+EN_COURS_DE_REFLEXION);
			break;

		default:
			System.out.println("Veuillez faire un choix !");
			break;
		}
		sc.close();
	}

}
