/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author Joanna exercice méthode qui calcule le somme des éléments passés en
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
		System.out.println("Entrez le nombre d'éléments du tableau :"); // demande utilisateur nombre de cases du
																		// tableau
		tailleTabl = sc.nextInt(); // assignation du nombre donné par l'utilisateur à la variable
		int[] tabl = new int[tailleTabl]; // création du tableau à la taille indiquée par l'utilisateur
		for (int i = 0; i < tabl.length; i++) { // boucle for pour remplir le tableau (possible avec un while aussi par
												// exemple)
			System.out.println("Entrez l'élément n°" + (i + 1)); // demande à l'utilisateur de saisir les valeurs du
																	// tableau pour chaque élément
			tabl[i] = sc.nextInt(); // affectation de chaque index du tableau par entrée utilisateur
		}
		sommeT = tablowSomme(tabl); // appel de la méthode avec en paramètre le tableau saisi par l'utilisateur
		System.out.println("La somme des éléments du tableau est : " + sommeT); // affichage de la somme
		sc.close();
	}

	public static int tablowSomme(int[] tablow) { // méthode qui prend en paramètre un tableau
		int somme = 0;
		for (int i = 0; i < tablow.length; i++) {
			somme = somme + tablow[i]; // calcule la somme des éléments au fur et à mesure
		}
		return somme; // retourne la somme des éléments du tableau
	}
}
