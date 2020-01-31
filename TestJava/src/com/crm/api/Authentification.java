/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author Joanna
 *
 *         connexion avec trois tentatives par login
 *         demande login / demande password / verification match 
 *         tableau deux dimensions contenant les login et password
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

		String login = "", password = "";
		Scanner sc = new Scanner(System.in);
		final int INDEX_LOGIN = 0, INDEX_PASSWORD = 1;
		int tryAllowed = 3, posi = -1;
		boolean checkLogin = false, checkPassword = false;

		while (checkLogin == false || checkPassword == false && tryAllowed >= 0) {
			if (tryAllowed == 3) {
				System.out.println("Please enter your login :");
				login = sc.nextLine();
			}
			System.out.println("Please enter your password :");
			password = sc.nextLine();
			tryAllowed--;
			posi = Utils.foundIndex(ID_TABL, login, INDEX_LOGIN); // recherche du login saisi dans le tableau login et
																	// affecte son indice à la variable posi
			if (posi > 0) { // si le login est contenu dans le tableau login (posi est donc >0)
				checkLogin = true;
				checkPassword = (password.contentEquals(ID_TABL[INDEX_PASSWORD][posi])); // vérifie que le password
																							// saisi correspond au
																							// password lié au login
																							// saisi
			}
			if (checkPassword == false) {
				System.out.println("/!\\ Remaining try: " + tryAllowed);
				if (tryAllowed == 0) { // après 3 tentative, si couple login/pwd mauvais : remise par défaut des
										// variables et retour en début de boucle
					checkLogin = false;
					tryAllowed = 3;
					posi = -1;
					System.out.println("____________________________" + "\nIncorrect login or password =[ "+"\nTry again.");
				}
			}
		}
		if (checkLogin == true && checkPassword == true) {
			System.out.println("You are connected");
		}
		sc.close();
	}
}
