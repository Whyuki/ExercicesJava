/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author Joanna
 *
 */
public class Authentification {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String ID_TABL[][] = {
				{ "A.BOUDIER", "T.BROWN", "L.CARRIVALE", "K.CHARIH", "G.CROUZET", "D.DOGHMANE", "R.HAMZA",
						"J.JEANNIARD", "M.RAVANDOUST", "J.SCHMITT", "B.SCHOENMAEKER", "L.SEDY", "N.THOUVENOT",
						"S.TORRENTI" },
				{ "BOudi3r8", "BRoun7", "C@rriv@l38", "CH@rih6", "CRouz3t7", "DOghp@n35", "H@pz@4", "J3@nni@rd9",
						"R@v@ndoust6", "SChpitt6", "SCho3nu@3k3r8", "S3dy7", "THouv3not7", "TOrr3nti7" } };

		String login, password;
		Scanner sc = new Scanner(System.in);
		int tryAllowed = 3, posi = -1;
		boolean checkLogin = false, checkPassword = false;

		System.out.println("Please enter your login :");
		login = sc.nextLine();
		while (checkLogin == false || checkPassword == false && tryAllowed >= 0) {
			System.out.println("Please enter your password :");
			password = sc.nextLine();
			tryAllowed--;
			posi = Utils.foundInd(ID_TABL, login);
			if (posi > 0 && login.contentEquals(ID_TABL[0][posi])) {
				checkLogin = true;
				checkPassword = (password.contentEquals(ID_TABL[1][posi]));
			}
			if (checkPassword == false) {
				System.out.println("/!\\ Remaining try: " + tryAllowed);
				if (tryAllowed == 0) {
					checkLogin = false;
					tryAllowed = 3;
					posi = -1;
					System.out.println("____________________________" + "\nIncorrect login or password, try again :"
							+ "\nPlease enter your login :");
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
