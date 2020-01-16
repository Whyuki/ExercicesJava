import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class DessineMoiUnTriangle {

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

		for (x = 0; x < side; x++) {
			for (y = x; y >= 0; y--) {
				System.out.print(star);
			}
			System.out.println();
		}


		sc.close();
	}
}
