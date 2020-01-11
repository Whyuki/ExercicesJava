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
//		String[] loginT = { "A.BOUDIER", "T.BROWN", "L.CARRIVALE", "K.CHARIH", "G.CROUZET", "D.DOGHMANE", "R.HAMZA",
//				"J.JEANNIARD", "M.RAVANDOUST", "J.SCHMITT", "B.SCHOENMAEKER", "L.SEDY", "N.THOUVENOT", "S.TORRENTI" };
//		System.out.println(loginT.length);

		String login, password;
		Scanner sc = new Scanner(System.in);
		int i = 0, tryAllowed = 3;
		boolean checkLogin = false, checkPassword = false;
		System.out.println("Please enter your login :");
		while (checkLogin == false) {
			login = sc.nextLine();
			checkLogin = (login.contentEquals("J.SCHMITT")) || (login.contentEquals("JO"));
			if (checkLogin == false) {
				System.out.println("Incorrect login, try again :");
			}
		}
		System.out.println("Please enter your password :" + "\n" + "__Try allowed : " + tryAllowed);
		while (checkPassword == false && i < 3) {
			password = sc.nextLine();
			checkPassword = (password.contentEquals("SChwitt6"));
			i++;
			tryAllowed--;
			if (checkPassword == false && tryAllowed > 0) {
				System.out.println("Incorrect password, try again :" + "\n__Remaining try : " + tryAllowed);
			}
		}
		if (checkPassword == true) {
			System.out.println("You are connected");
		} else {
			System.out.println("Remaining try : " + tryAllowed + "\nYour account is blocked");
		}
		sc.close();

	}

}
