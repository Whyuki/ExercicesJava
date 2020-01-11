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
		int i = 0, tryAllowed = 3;
		boolean checkLogin = false, checkPassword = false;
		while (checkLogin == false) {
			System.out.println("Please enter your login :");
			login = sc.nextLine();
			checkLogin = (login.contentEquals("J.SCHMITT"));

		}
		checkPassword = false;
		while (checkPassword == false && i < 3) {
			System.out.println("Please enter your password :" + "\n" + "Remaining try : " + tryAllowed);
			password = sc.nextLine();
			checkPassword = (password.contentEquals("SChwitt6"));
			i++;
			tryAllowed--;
		}
		if (checkPassword == true) {
			System.out.println("You are connected");
		} else {
			System.out.println("Remaining try : " + tryAllowed + "\nYour account is blocked");
		}
		sc.close();

	}

}
