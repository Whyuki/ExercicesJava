
import java.util.Scanner;


/**
 * 
 */

/**
 * @author Joanna
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
		System.out.println("Please enter your login :");
		login = sc.nextLine();
		System.out.println("Please enter your password :");
		password = sc.nextLine();
		if (login.equals("CRM") && password.equals("CDI1234")) {
			System.out.println("You are connected");
		} else {
			System.out.println("Incorrect login or password");
		}
		sc.close();

	}

}
