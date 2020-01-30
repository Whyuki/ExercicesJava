import java.util.Scanner;

/**
 * Compare trois nombres saisis par l'utilisateur et affiche le plus grand
 *
 * @author Joanna
 */
public class CompareNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb1, nb2, nb3, max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Compare three numbers :\n***********************");
		System.out.println("Please enter the first number :");
		nb1 = sc.nextInt();
		System.out.println("Please enter the second number :");
		nb2 = sc.nextInt();
		System.out.println("Please enter the third number :");
		nb3 = sc.nextInt();
		if (nb3 >= nb2 && nb3 >= nb1) {
			max = nb3;
		} else if (nb2 >= nb3 && nb2 >= nb1) {
			max = nb2;
		} else if (nb1 >= nb2 && nb1 >= nb3) {
			max = nb1;
		}
		System.out.println("The greatest number is : " + max);
		sc.close();
	}

}
