package com.crm.boapp;

import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		Personne pers = new Personne();
		System.out.println("Veuillez saisir votre Prénom :");
		pers.setPrenom(sc.nextLine());
		System.out.println("Veuillez saisir votre Nom :");
		pers.setNom(sc.nextLine());
		System.out.println("Veuillez saisir votre Surnom :");
		pers.surnom = sc.nextLine();

		pers.afficherDetails();
		// attribut private need method get.. / 
		// attribut public don't need : objetName.attributName 
		// =
//		System.out.println(
//				"Bonjour " + pers.getPrenom() + " " + pers.getNom() + "( " + pers.surnom + " pour les intimes ;) ).");

		sc.close();
	}

}
