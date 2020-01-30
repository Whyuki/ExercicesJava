package com.crm.api;

import java.util.Arrays;

/**
 * @author Joanna
 * 
 * comparaison deux tableaux de types primitifs
 */
public class CompareTableauPrimitif {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab1 = { 1, 2, 3 };
		int[] tab2 = { 1, 2, 4 };
		boolean idem;
		idem = Arrays.equals(tab1, tab2);
		System.out.println("Tableaux identiques ? : " + idem);

	}

}
