/**
 * avec interraction user
 */

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
		String prenom = "", nom = "", surnom = "";
		Personne pers = new Personne();
		System.out.println("\n1) " + "Veuillez saisir votre Prénom :");
		pers.setPrenom(sc.nextLine());
		System.out.println("Veuillez saisir votre Nom :");
		pers.setNom(sc.nextLine());
		System.out.println("Veuillez saisir votre Surnom :");
		pers.surnom = sc.nextLine();
		pers.afficherDetails();

		// avec constructeur par parametres

		System.out.println("\n2) " + "Veuillez saisir votre Prénom :");
		prenom = sc.nextLine();
		System.out.println("Veuillez saisir votre Nom :");
		nom = sc.nextLine();
		System.out.println("Veuillez saisir votre Surnom :");
		surnom = sc.nextLine();
		Personne pers1 = new Personne(surnom, nom, prenom);
		pers1.afficherDetails();

		sc.close();
	}

}
