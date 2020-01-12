import java.util.Scanner;

import com.crm.api.ArrayId;

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
		int i = 0, tryAllowed = 3, posi = -1;
		boolean checkLogin = false, checkPassword = false;
		System.out.println("Please enter your login :");
		login = sc.nextLine();
		for (int ix = 0; ix < ArrayId.LOGIN_ARRAY.length; ix++) {

			if (login.contentEquals(ArrayId.LOGIN_ARRAY[ix])) {
				posi = ix;
				break;
			}
		}
		if (posi >= 0) {
			checkLogin = true;
			System.out.println(" it's ok "+posi);
//			checkLogin = (posi >= 0);
		} else {
			System.out.println("rip");
		}
		while (checkPassword == false && i < 3) {
			System.out.println("Please enter your password :");
			password = sc.nextLine();
			checkPassword = (password.contentEquals(ArrayId.PASSWORD_ARRAY[posi]));
			i++;
			tryAllowed--;
			if (checkLogin == false || checkPassword == false) {
				System.out.println("remaining try: " + tryAllowed);
			}
			if (tryAllowed == 0) {
				System.out.println("______________" + "\nIncorrect login or password, try again :");
				checkLogin = false;
				checkPassword = false;
				i = 0;
				tryAllowed = 3;
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
