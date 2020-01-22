
import java.util.Scanner;

import com.crm.api.IdCrm;

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
		System.out.println("Please enter your login :");
		login = sc.nextLine();
		System.out.println("Please enter your password :");
		password = sc.nextLine();
		if (login.equals(IdCrm.LOGIN) && password.equals(IdCrm.PWD)) {
			System.out.println("You are connected");
		} else {
			System.out.println("Incorrect login or password");
		}
		sc.close();

	}

}
