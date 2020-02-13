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
		
		System.out.println("test : "+Enum.VENDREDI);
		
		for (Enum lang : Enum.values()) {
			if (Enum.VENDREDI.equals(lang))
				System.out.println("J'aime le : " + lang);
			else
				System.out.println(lang);
		}

	}

}
