package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Personne;

/**
 * @author Joanna
 *
 */
public class TableauPersonneApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nbPersonne = 0;
		System.out.println("Combien de personne dans le groupe ?");
		nbPersonne = sc.nextInt();
		Personne[] tabPers = new Personne[nbPersonne];
		
		for (int i = 0; i < tabPers.length; i++) {
			Personne toto = new Personne();
			System.out.println("Personne n° " + (i + 1) + ", veuillez saisir votre Prénom :");
			toto.setPrenom(sc.nextLine());
			System.out.println("Veuillez saisir votre Nom :");
			tabPers[i].setNom(sc.nextLine());
			System.out.println("Veuillez saisir votre Surnom :");
			tabPers[i].surnom = sc.nextLine();

			tabPers[i].afficherDetails();
		}

	}

}
