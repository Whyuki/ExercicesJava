/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class TableauTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabInt;
		tabInt = new int[5];
		System.out.println("longeur tabInt" + tabInt.length);

		int[] tabInt1 = new int[5];
		System.out.println(tabInt1[0]);
		tabInt1[0] = 5;
		System.out.println(tabInt1[0]);
		System.out.println(tabInt1[1]);

		int tabInt2[] = { 45, 55, 65, 75, 85 };
		System.out.println(tabInt2[0]);
		for (int i = 0; i < tabInt2.length; i++) {
			System.out.println(tabInt2[i]);
		}
	}

}
