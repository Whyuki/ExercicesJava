/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class BoucleForTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 999;
//		for (i = 0; i < 10; i++) {
//			System.out.println("i = " + i);
//		}
//		System.out.println("after for : i = " + i); // déclaration i avant boucle for sinon i inaccessible

		for (int x = -5; x <= 5; x++) {
			if (x == 0) {
				System.out.println("division par 0");
//				break;
				continue;
			}
			System.out.println(1.0 / x);
		}
		System.out.println("oki");
	}
}
