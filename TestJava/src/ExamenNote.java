import java.util.Scanner;

/**
 * résultat examen avec if imbriqués
 */
/**
 * @author Joanna
 * @version 1.0.1
 */
public class ExamenNote {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int note;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre note :");
		note = sc.nextInt();

		if (note >= 0 && note <= 20) {
			if (note >= 8) {
				if (note >= 10) {
					if (note >= 12) {
						if (note >= 14) {
							if (note >= 16) {
								System.out.println("Vous êtes admis avec la mention TB");
							} else {
								System.out.println("Vous êtes admis avec la mention B");
							}
						} else {
							System.out.println("Vous êtes admis avec la mention AB");
						}
					} else {
						System.out.println("Vous êtes admis");
					}
				} else {
					System.out.println("Vous êtes éligible au rattrapage");
				}
			} else {
				System.out.println("Vous êtes ajourné");
			}
		} else {
			System.out.println("Note invalide");
		}
		sc.close();
	}
}
