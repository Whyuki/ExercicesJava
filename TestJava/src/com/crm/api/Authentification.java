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
		String login, password;
		String[][] idTabl = { { "A.BOUDIER", "T.BROWN", "L.CARRIVALE", "K.CHARIH", "G.CROUZET", "D.DOGHMANE", "R.HAMZA",
				"J.JEANNIARD", "M.RAVANDOUST", "J.SCHMITT", "B.SCHOENMAEKER", "L.SEDY", "N.THOUVENOT", "S.TORRENTI" },
				{ "BOudi3r8", "BRoun7", "C@rriv@l38", "CH@rih6", "CRouz3t7", "DOghp@n35", "H@pz@4", "J3@nni@rd9",
						"R@v@ndoust6", "SChpitt6", "SCho3nu@3k3r8", "S3dy7", "THouv3not7", "TOrr3nti7" } };
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

				posi = Utils.foundInd(idTabl, login);
				System.out.println(posi);

				if (login.contentEquals(idTabl[0][posi])) {
					checkLogin = true;

				}

			}
			if (checkLogin == true) {
				checkPassword = (password.contentEquals(idTabl[1][posi]));
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
