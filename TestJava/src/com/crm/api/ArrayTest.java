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
//		int i;
//		i=0;
//		String[] loginT = { "A.BOUDIER", "T.BROWN", "L.CARRIVALE", "K.CHARIH", "G.CROUZET", "D.DOGHMANE", "R.HAMZA",
//				"J.JEANNIARD", "M.RAVANDOUST", "J.SCHMITT", "B.SCHOENMAEKER", "L.SEDY", "N.THOUVENOT", "S.TORRENTI" };
//		System.out.println(loginT.length);

		String[] loginT = { "ok", "A.BOUDIER", "T.BROWN", "L.CARRIVALE", "K.CHARIH", "G.CROUZET", "D.DOGHMANE",
				"R.HAMZA", "J.JEANNIARD", "M.RAVANDOUST", "J.SCHMITT", "B.SCHOENMAEKER", "L.SEDY", "N.THOUVENOT",
				"S.TORRENTI" };
		String str;
		boolean check = false;
		Scanner sc = new Scanner(System.in);

		System.out.println("login");
		str = sc.next();

		for (int i = 0; i < loginT.length; i++) {

			if (str.contentEquals(loginT[i])) {

				System.out.println("oki"+" it's"+check);
				check = true;
				
			} else {
				System.out.println("rip"+" it's"+check);
				break;
			}
		}
		sc.close();
	}
	
}
