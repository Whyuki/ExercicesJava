/**
 * sans interraction
 */
package com.crm.boapp;

import com.crm.bo.CompteBancaire;

/**
 * @author Joanna
 *
 */
public class CompteBancaireApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompteBancaire comptA = new CompteBancaire("1234567890");
		comptA.afficherDetails();
		comptA.retrait(151);
		comptA.depot(300);
		comptA.retrait(450);
				
	}

}
