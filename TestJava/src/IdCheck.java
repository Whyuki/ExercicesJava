
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
		System.out.println("Login :");
		login = sc.nextLine();
		System.out.println("Password :");
		password = sc.nextLine();
		if (login.equals(IdCrm.LOGIN) && password.equals(IdCrm.PWD)) {
			System.out.println("Connected");
		} else {
			System.out.println("Incorrect login or password");
		}
		sc.close();

//		String login, password;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Login :");
//		login = sc.nextLine();
//		System.out.println("Password :");
//		password = sc.nextLine();
//		if (login.equals(IdCrm.LOGIN) && password.equals(IdCrm.PWD)) {
//			System.out.println("Connected");
//		} else if (!login.equals(IdCrm.LOGIN)) {
//			System.out.println("Incorrect login");
//		} else if (!password.equals(IdCrm.PWD)) {
//			System.out.println("Incorrect password");
//		}
//		sc.close();

	}

}
