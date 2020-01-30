/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author Joanna
 * 
 *         exercice méthode qui calcule le somme des éléments passés en
 *         paramètres et l'utiliser dans la méthode main
 */
public class TableauSomme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tailleTabl, sommeT;

		// demande utilisateur nombre de cases du tableau
		System.out.println("Entrez le nombre d'éléments du tableau :");

		// assignation du nombre donné par l'utilisateur à la variable
		tailleTabl = sc.nextInt();

		// création du tableau à la taille indiquée par l'utilisateur
		int[] tabl = new int[tailleTabl];

		// boucle for pour remplir le tableau (possible avec un while aussi par exemple)
		for (int i = 0; i < tabl.length; i++) {

			// demande à l'utilisateur de saisir les valeurs du tableau pour chaque élément
			System.out.println("Entrez l'élément n°" + (i + 1));

			// affectation de chaque index du tableau par entrée utilisateur
			tabl[i] = sc.nextInt();
		}

		// appel de la méthode avec en paramètre le tableau saisi par l'utilisateur
		sommeT = tablowSomme(tabl);

		// affichage de la somme
		System.out.println("La somme des éléments du tableau est : " + sommeT);
		sc.close();
	}

	// méthode qui prend en paramètre un tableau
	public static int tablowSomme(int[] tablow) {
		int somme = 0;
		for (int i = 0; i < tablow.length; i++) {
			// calcule la somme des éléments au fur et à mesure
			somme = somme + tablow[i];
		}
		return somme; // retourne la somme des éléments du tableau
	}
}
