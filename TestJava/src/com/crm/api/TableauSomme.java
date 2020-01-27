/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author Joanna
 * exercice méthode qui calcule le somme des éléments passés en paramètres et l'utiliser dans la méthode main
 */
public class TableauSomme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tailleTabl, sommeT;
		System.out.println("Entrez le nombre d'éléments du tableau");
		tailleTabl = sc.nextInt();
		int[] tabl = new int[tailleTabl];
		for (int i = 0; i < tabl.length; i++) {
			System.out.println("Entrez l'élément n°" + (i + 1));
			tabl[i] = sc.nextInt();
		}
		sommeT = tablowSomme(tabl);
		System.out.println("La somme des éléments du tableau est : " + sommeT);
		sc.close();
	}

	public static int tablowSomme(int[] tablow) {
		int somme;
		somme = 0;
		for (int i = 0; i < tablow.length; i++) {
			somme = somme + tablow[i];
		}
		return somme;
	}
}
