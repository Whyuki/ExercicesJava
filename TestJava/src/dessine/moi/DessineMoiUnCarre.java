package dessine.moi;
import java.util.Scanner;

/**
 * @author Joanna
 * 
 * dessiner un carré aec des * à l'aide de deux boucles for
 * 
 */
public class DessineMoiUnCarre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0, side;
		char star = '*';
		System.out.println("Entrez la longueur");
		side = sc.nextInt();

		for (y = 0; y < side; y++) {

			for (x = 0; x < side; x++) {
				System.out.print(star);
			}
			System.out.println();
		}

		sc.close();
	}

}
