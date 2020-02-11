/**
 * 
 */
package com.crm.boapp;

import com.crm.bo.Voiture;

/**
 * @author Joanna
 *
 */
public class VoitureApp0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Voiture vroumvroum = new Voiture("Fiat", "noir", 3, "manuelle", 7000);

		vroumvroum.afficherDetails();

		System.out.println();
		vroumvroum.afficherVitesse();

		//acceleration
		vroumvroum.accelerer(40, "ville");
		vroumvroum.accelerer(40, "ville");
		vroumvroum.accelerer(60, "autoroute");
	}

}
