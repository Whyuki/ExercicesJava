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

		nbPersonne = sc.nextInt();
		Personne[] tabPers = new Personne[nbPersonne]; // Déclaration d'un tableau d'objet de type Personne 
		// construction d'objets de type Personne pour chaque case du tableau
		for (int i = 0; i < tabPers.length; i++) {
			tabPers[i] = new Personne();
			System.out.println("\nMembre n° " + (i + 1) + ", veuillez saisir votre Prénom :");
			tabPers[i].setPrenom(sc.next());
			System.out.println("Veuillez saisir votre Nom :");
			tabPers[i].setNom(sc.next());
			System.out.println("Veuillez saisir votre Surnom :");
			tabPers[i].surnom = sc.next();

			tabPers[i].afficherDetails();
			
		}
		Personne.affDet(tabPers);
		// équivalent :
		for(Personne per : tabPers ) {
			System.out.println("\nPrenom : "+per.getPrenom());
			System.out.println("Nom : "+per.getNom());
			System.out.println("Surnom : "+per.surnom);
		}
				
//		Personne.afficherResume(tabPers);
		
		sc.close();
	}

}
