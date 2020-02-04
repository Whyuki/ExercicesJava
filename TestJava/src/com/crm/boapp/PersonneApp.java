package com.crm.boapp;

import com.crm.bo.Personne;

/**
 * @author Joanna
 *
 */
public class PersonneApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne pers = new Personne();
		pers.surnom = "Jo";
		pers.setNom("SCHMITT");
		pers.setPrenom("Joanna");

		pers.afficherDetails();

	}

}
