import java.util.Scanner;

/**
 * differentes façon de définir le nombre le plus grand
 */

/**
 * @author Joanna
 *
 */
public class MaxNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// compare one bye one
		int nb1, nb2, nb3, max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Compare three numbers :\n-----------------------");
		System.out.println("Please enter the first number :");
		nb1 = sc.nextInt();
		max = nb1;
		System.out.println("Please enter the second number :");
		nb2 = sc.nextInt();
		if (nb2 > nb1) {
			max = nb2;
		}
		System.out.println("Please enter the third number :");
		nb3 = sc.nextInt();
		if (nb3 >= nb2) {
			max = nb3;
		}
		System.out.println("The greatest number is : " + max);
		sc.close();

		// compare one by one with Math.max
//		int nb1, nb2, nb3, max = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Compare three numbers :\n-----------------------");
//		System.out.println("Please enter the first number :");
//		nb1 = sc.nextInt();
//		max = nb1;
//		System.out.println("Please enter the second number :");
//		nb2 = sc.nextInt();
//		max = Math.max(nb1, nb2);
//		System.out.println("Please enter the third number :");
//		nb3 = sc.nextInt();
//		max = Math.max(nb3, max);
//		System.out.println("The greatest number is : " + max);
//		sc.close();

	}

}
