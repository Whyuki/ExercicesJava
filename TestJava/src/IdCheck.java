
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
		System.out.println("Password :");
		password = sc.nextLine();
		if (login.equals("CRM") && password.equals("CDI1234")) {
			System.out.println("Connected");
		} else {
			System.out.println("incorrect login or password");
		}
		sc.close();
	}

}
