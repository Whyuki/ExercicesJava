package test.perso;
import java.util.Scanner;

/**
 * Connexion avec 3 essais de pwd par login saisi, identifiants dans un tableau ArrayId
 * 
 * @author Joanna
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
		int tentative = 0, tryAllowed = 3, posi = -1;
		boolean checkLogin = false, checkPassword = false;
		System.out.println("Please enter your login :");
		login = sc.nextLine();
		while (checkLogin == false || checkPassword == false && tentative < 3) {
			System.out.println("Please enter your password :");
			password = sc.nextLine();
			tentative++;
			tryAllowed--;
			if (checkLogin == false) {
				for (int indexPosition = 0; indexPosition < ArrayId.LOGIN_ARRAY.length; indexPosition++) {

					if (login.contentEquals(ArrayId.LOGIN_ARRAY[indexPosition])) {
						checkLogin = true;
						posi = indexPosition;
						break;
					}
				}
			}
			if (checkLogin == true) {
				checkPassword = (password.contentEquals(ArrayId.PASSWORD_ARRAY[posi]));
			}
			if (checkPassword == false) {
				System.out.println("/!\\ remaining try: " + tryAllowed);
				if (tryAllowed == 0) {
					System.out.println("______________" + "\nIncorrect login or password, try again :");
					checkLogin = false;
					checkPassword = false;
					tentative = 0;
					tryAllowed = 3;
					posi = -1;
					System.out.println("Please enter your login :");
					login = sc.nextLine();
				}
			}
		}
		if (checkLogin == true && checkPassword == true) {
			System.out.println("You are connected");
		}

		sc.close();

	}

}