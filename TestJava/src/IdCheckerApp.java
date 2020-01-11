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
		checkLogin = (login.contentEquals("J.SCHMITT")) || (login.contentEquals("JO"));
		while (checkPassword == false && i < 3) {
			System.out.println("Please enter your password :");
			password = sc.nextLine();
			checkPassword = (password.contentEquals("666"));
			i++;
			tryAllowed--;
			if (checkLogin == false || checkPassword == false) {
				System.out.println("remaining try: " + tryAllowed);
			}
			if (tryAllowed == 0) {
				System.out.println("Incorrect login or password, try again :");
				checkLogin = false;
				checkPassword = false;
				i = 0;
				tryAllowed = 3;
				System.out.println(checkLogin);
				System.out.println(checkPassword);
				System.out.println(tryAllowed);
				System.out.println(i);
				System.out.println("Please enter your login :");
				login = sc.nextLine();
				checkLogin = (login.contentEquals("J.SCHMITT")) || (login.contentEquals("JO"));
			}
		}
		if (checkLogin == true && checkPassword == true) {
			System.out.println("You are connected");
		}

		sc.close();

	}

}
