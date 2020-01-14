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
		// TODO Auto-generated method stub
		String choix = "ok";
		Scanner sc = new Scanner(System.in);
		final String CDA = "C", DWWM = "D", REORIENTATION = "R", EN_COURS_DE_REFLEXION = "E";

		System.out.println("Veuillez choisir entre les propositions suivantes :" + " \n(C) : CDA" + "\n(D) : DWWM"
				+ "\n(R) : Réorientation" + "\n(E) : En cours de réflexion ");
		choix = sc.nextLine();

		switch (choix) {
		case CDA:
			System.out.println("Vous avez choisi de suivre la formation Concepteur Développeur d'Applications");
			break;
			
		case DWWM :
			System.out.println("Vous avez choisi de suivre la formation Développeur Web Web-Mobile");
			break;
			
		case REORIENTATION:
			System.out.println("Vous avez choisi de suivre une réorientation professionnelle");
			break;
			
		case EN_COURS_DE_REFLEXION:

			System.out.println("Vous avez déclaré être en cours de réflexion. ");
			break;

		default:
			System.out.println("Ceci n'est pas sérieux !");
			break;
		}
		sc.close();
	}

}
