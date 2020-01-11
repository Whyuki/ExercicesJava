
import java.util.Scanner;

/**
 * 
 */

/**
 * @author joann
 *
 */
public class IdCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String login, password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Login :");
		login = sc.nextLine();
		if (login.equals("J.SCHMITT")) {
			System.out.println("Password :");
			password = sc.nextLine();
			if (password.equals("SChwitt6")) { // !!! string == "blabla" ---> str.equals("blabla")
				System.out.println("Connected");
			} else {
				System.out.println("incorrect password");
			}
		} else {
			System.out.println("incorrect login");
		}
		sc.close();

	}

}
