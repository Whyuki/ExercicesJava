import java.util.Scanner;

/**
 * 
 */

/**
 * Generateur d'identifiants avec prenom et nom
 *
 * @author Joanna
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
		login = firstName.substring(0, 1).toUpperCase() + "." + name.toUpperCase();
		passworld = name.substring(0, 2).toUpperCase().replace('A', '@').replace('M', 'W').replace('E', '3').replace('W', 'U')
				+ name.substring(2).toLowerCase().replace('a', '@').replace('m', 'p').replace('e', '3').replace('w', 'u') + firstName.length();
		System.out.println("Your login is : " + login);
		System.out.println("Your passworld is :" + passworld);
		sc.close();

	}

}
