import java.util.Scanner;

/**
 * 
 */

/**
 * @author joann
 *
 */
public class IdCheckerApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String login, password;
		Scanner sc = new Scanner(System.in);
		int i = 0, tryAllowed = 3;
		boolean checkLogin = false, checkPassword = false;
		System.out.println("Please enter your login :");
		login = sc.nextLine();
		System.out.println("Please enter your password :" + "\n" + "__Try allowed : " + tryAllowed);
		password = sc.nextLine();
		checkLogin = (login.contentEquals("J.SCHMITT")) || (login.contentEquals("JO"));
		checkPassword = (password.contentEquals("666"));
		if (checkLogin == true && checkPassword == true) {
			System.out.println("You are connected");
		} else {
			System.out.println("Incorrect login or password, try again :");
		}
		while (checkPassword == false && i < 3)
			i++;
		tryAllowed--;
		if (checkPassword == false && tryAllowed > 0) {
			System.out.println("Incorrect password, try again :" + "\n__Remaining try : " + tryAllowed);
		}
		sc.close();

	}

}
