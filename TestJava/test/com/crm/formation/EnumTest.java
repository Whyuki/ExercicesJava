/**
 * 
 */
package com.crm.formation;

/**
 * @author Joanna
 *
 */
public class EnumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Enum lang : Enum.values()) {
			if (Enum.VENDREDI.equals(lang))
				System.out.println("J'aime le : " + lang);
			else
				System.out.println(lang);
		}

	}

}
