/**
 * 
 */
package com.crm.formation;

/**
 * @author Joanna
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

		for (int x = 0; x <= 10; x++) {
			if (x == 5) {
				System.out.println(x);
//				break;
				continue;
			}
			System.out.println(x);
		}
		System.out.println("fin");
	}
}
