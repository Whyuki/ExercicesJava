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
public class TableauPersonneApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nbPersonne = 0;
		System.out.println("De combien de personne se compose votre équipe ?");

		nbPersonne = Integer.parseInt(sc.nextLine());
		Personne[] tabPers = new Personne[nbPersonne]; // Déclaration d'un tableau d'objet de type Personne
		// construction d'objets de type Personne pour chaque case du tableau

		for (int i = 0; i < tabPers.length; i++) {
			tabPers[i] = new Personne();
			System.out.println("\nMembre n° " + (i + 1) + ", veuillez saisir votre Prénom :");
			tabPers[i].setPrenom(sc.nextLine());
			System.out.println("Veuillez saisir votre Nom :");
			tabPers[i].setNom(sc.nextLine());
			System.out.println("Veuillez saisir votre Surnom :");
			tabPers[i].surnom = sc.nextLine();

			tabPers[i].afficherDetails();

		}
		System.out.println("\nListe des membres de l'équipe :");

		for (Personne pers : tabPers) {
			System.out.println(pers.surnom + " (" + pers.getPrenom() + " " + pers.getNom() + ")");
		}

		// équivalent (methodes statiques) for each & for :
//		Personne.affDet(tabPers);
//		
//		Personne.afficherResume(tabPers);
//				
//		


		sc.close();
	}

}
