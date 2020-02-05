/**
 * sans interraction user
 */
package com.crm.boapp;

import com.crm.bo.Personne;

/**
 * @author Joanna
 *
 */
public class PersonneApp0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne pers1 = new Personne();
		pers1.afficherDetails();
		pers1.surnom="Jojo";
		pers1.setNom("Schmitt");
		pers1.setPrenom("Joanna");
		pers1.afficherDetails();
		
		System.out.println();
		Personne pers2 = new Personne("jojo", "schmitt", "joanna");
		pers2.afficherDetails();
	}

}
