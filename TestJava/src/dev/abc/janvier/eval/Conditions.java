package dev.abc.janvier.eval;

/**
 * @author Joanna
 *
 */
public class Conditions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char choix = 'Z';
		switch (choix) {
		case 'O':
			System.out.println("Vous aimez la programmation");
			break;
		case 'N':
			System.out.println("Vous n'aimez pas la programmation");
			break;
		default:
			System.out.println("Vous voulez voir la suite");
		}
	}

}
