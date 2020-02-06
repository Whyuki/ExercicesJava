/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.CompteBancaire;

/**
 * @author Joanna
 *
 */
public class CompteBancaireApp1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numClient = 0;

		System.out.println("Nouveau client ? O/N");
		if (sc.nextLine().equalsIgnoreCase("o")) {
			numClient++;
			CompteBancaire compt1 = new CompteBancaire(numClient); // creation compte avec generation d'un numero de
																	// compte en fonction du numClient (enieme client)
																	// pour generation progressive des numero de compte
			compt1.afficherDetails();
		}

		// tableau de compte bancaire avec generation denumero de compte pour chaque
		// compte

//		CompteBancaire[] tablCompt = new CompteBancaire[5];
//		for (int i = 0; i < tablCompt.length; i++) {
//			tablCompt[i] = new CompteBancaire(String.format("%010d", i + 1));
////			^ équivalent sur deux lignes : instance objet + set numero de compte :
////			tablCompt[i]= new CompteBancaire());
////			tablCompt[i].setNumeroCompte(String.format("%010d", i));
//			tablCompt[i].afficherDetails();
//		}

//		pad
//		String.format()
//		String nombre = String.format("%010d", 1);
//		System.out.println(nombre);

		sc.close();
	}

}
