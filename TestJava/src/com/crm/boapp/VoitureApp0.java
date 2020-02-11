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

		// instance
		Voiture vroumvroum = new Voiture("Fiat", "noir", 3, "manuelle", 7000);

		// afficher détails
		vroumvroum.afficherDetails();

		// demarrer
		vroumvroum.demarrage();

		// afficher vitesse actuelle
		System.out.println();
		vroumvroum.afficherVitesse();

		// acceleration
		vroumvroum.accelerer(40, "ville");
		vroumvroum.accelerer(40, "ville");
		vroumvroum.accelerer(60, "autoroute");

		// ralentir
		vroumvroum.ralentir(40);

		// stop
		vroumvroum.arret();

		// klaxonner
		vroumvroum.klaxonner();

	}

}
