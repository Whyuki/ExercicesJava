/**
 * creation de compte bancaire ave generation du n° de compte
 * et test vector
 */
package com.crm.boapp;

import java.util.Vector;

import com.crm.bo.CompteBancaire;

/**
 * @author Joanna
 *
 */
public class CompteBancaireApp1 {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompteBancaire compt1 = new CompteBancaire(); // constructeur avec generation et assignation numeroCompte en f°
														// du compteur de client qui s'incremente à chaque instance
														// d'objet
		compt1.afficherDetails();
		
		CompteBancaire compt2 = new CompteBancaire();
		compt2.afficherDetails();

		
		
		
		
		
		
		// tableau de comptes bancaires avec generation de numero de compte (increment à
		// chaque instance)
		CompteBancaire[] tablCompt = new CompteBancaire[5];
		for (int i = 0; i < tablCompt.length; i++) {
			tablCompt[i] = new CompteBancaire();
			tablCompt[i].afficherDetails();
		}

		Vector compteBanqu = new Vector();
		compteBanqu.addElement(compt1);
		compteBanqu.addElement(compt2);
		int posi = compteBanqu.indexOf(compt1);
		System.out.println(posi);
		posi = compteBanqu.indexOf(compt2);
		System.out.println(posi);
		compteBanqu.addElement(new CompteBancaire());
		((CompteBancaire) compteBanqu.get(2)).afficherDetails();
		compteBanqu.addElement(new CompteBancaire());
		((CompteBancaire) compteBanqu.get(3)).afficherDetails();
		
		
		
//		pad
//		String.format()
//		String nombre = String.format("%010d", 1);
//		System.out.println(nombre);

	}

}
