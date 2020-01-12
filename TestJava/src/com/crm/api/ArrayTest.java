/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author joann
 *
 */
public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] loginT = { "A.BOUDIER", "T.BROWN", "L.CARRIVALE", "K.CHARIH", "G.CROUZET", "D.DOGHMANE",
//				"R.HAMZA", "J.JEANNIARD", "M.RAVANDOUST", "J.SCHMITT", "B.SCHOENMAEKER", "L.SEDY", "N.THOUVENOT",
//				"S.TORRENTI" };
		String login, pwd;
		int posi;
		boolean check = false;
		Scanner sc = new Scanner(System.in);

		System.out.println("login");
		login = sc.next();

		for (int i = 0; i < ArrayId.LOGIN_ARRAY.length; i++) {

			if (login.contentEquals(ArrayId.LOGIN_ARRAY[i])) {
				posi = i; //for check password
				check = true;
				System.out.println("position "+posi);
				break;
			}
		}
		if (check == true) {
			System.out.println("oki" + " it's " + check);
		} else {

			System.out.println("rip" + " it's " + check);
		}
		System.out.println("pwd :");
		pwd = sc.next();
//posi= pwd
//		if (pwd.contentEquals(ArrayId.PASSWORD_ARRAY[posi])) {
//			System.out.println("oki" + " it's " + check);
//		} else {
//
//			System.out.println("rip");
//		}

		
		sc.close();
	}
}