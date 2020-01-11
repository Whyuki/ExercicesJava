import java.util.Scanner;

/**
 * 
 */

/**
 * @author joann
 *
 */
public class IdChecker3try {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String login, password;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		boolean checkLogin = false, checkPassword = false;
		while (checkLogin == false) {
			System.out.println("Login :");
			login = sc.nextLine();
			checkLogin = (login.contentEquals("J.SCHMITT"));

		}
		checkPassword = false;
		while (checkPassword == false && i < 3) {
			System.out.println("Password :");
			password = sc.nextLine();
			checkPassword = (password.contentEquals("SChwitt6"));
			i++;
			// System.out.println("try " + i + "\nincorrect password, try again :");
		}
		if (checkPassword == true) {
			System.out.println("Connected");
		} else {
			System.out.println("error");
		}

		sc.close();

	}

}
