import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class DessineMoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0, longu;
		char star ='*';
		System.out.println("Entrez la longueur");
		longu = sc.nextInt();
		while (i < longu) {
			System.out.println(star);
			i++;
		}

		sc.close();
	}

}
