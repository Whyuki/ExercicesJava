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
		System.out.println("Please enter your first name");
		firstName = sc.nextLine();
		System.out.println("Please enter your name");
		name = sc.nextLine();
		login = firstName.substring(0, 1) + "." + name.toUpperCase();
		passworld = name.substring(0, 1) + name.substring(1, 2).replace('a', '@').replace('A', '@').replace('m', 'w').replace('M', 'W').toUpperCase() + name.substring(2).replace('a', '@').replace('A', '@').replace('m', 'w').replace('M', 'W')
				+ firstName.length();
		System.out.println("Your login is : " + login);
		System.out.println("Your passworld is :" + passworld);
		sc.close();

	}

}
