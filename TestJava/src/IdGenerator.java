import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class IdGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String firstName, name, login, passworld;
		System.out.println("Please enter your firstname");
		firstName = sc.nextLine();
		System.out.println("Please enter your name");
		name = sc.nextLine();
		login = firstName.substring(0, 1) + "." + name.toUpperCase();
		passworld = name.substring(0, 1) + name.substring(1, 2).toUpperCase() + name.substring(2).replace('a', '@')
				+ firstName.length();
		System.out.println("Your login is : " + login);
		System.out.println("Your passworld is :" + passworld);

		sc.close();

	}

}
