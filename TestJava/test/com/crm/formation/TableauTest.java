/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class TableauTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclaration de tableau :
		// 1ere méthode déclarative :
		int[] tablInt = new int[5];
		// 2nde méthode déclarative :
		int tablInt1[] = new int[5];

		// Déclaration et initialisation d'un tableau
		int[] tablInt3 = { 1, 2, 3 };

		// Accès à un élément du tableau
		int premierElement, deuxiemeElement, troisiemeElement;
//		int quatriemeElement;
		premierElement = tablInt3[0];
		System.out.println("Premier élément (indice 0) : " + premierElement);
		deuxiemeElement = tablInt3[1];
		System.out.println("Deuxième élément (indice 1) : " + deuxiemeElement);
		troisiemeElement = tablInt3[2];
		System.out.println("Troisième élément (indice 2) : " + troisiemeElement);
//		quatriemeElement = tablInt3[3];
//		System.out.println("Quatrième élément : " + quatriemeElement);
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3 at
		 * com.crm.formation.TableauTest.main(TableauTest.java:33)
		 * 
		 */

		// Modification valeur d'un élément du tableau
		tablInt3[0] = 10;
		premierElement = tablInt3[0];
		System.out.println("Premier élément (après modification) : " + premierElement);

		// Afficher la taille du tableau
		System.out.println("Taille du tableau tablInt3 : " + tablInt3.length);

		// Parcours du tableau :
		/*
		 * équivalent System.out.println(tablInt3[0]); System.out.println(tablInt3[1]);
		 * System.out.println(tablInt3[2]);
		 */
		// Parcours avec une boucle :
		// 1ère version
		System.out.println("Parcours du tableau 1ère version");
		for (int i = 0; i < tablInt3.length; i++) {
			System.out.println(tablInt3[i]);
		}
		// 2nde version
		System.out.println("Parcours du tableau 2nde version");
		for (int nb : tablInt3) { // parcours du tableau et affectation du contenu de chaque élément du tableau
									// dans nb
			System.out.println(nb);
		}

		int[] tabInt;
		tabInt = new int[5];
		System.out.println("\nlongeur tabInt : " + tabInt.length);

		int[] tabInt1 = new int[5];
		System.out.println(tabInt1[0]); // affichage 1er élément
		tabInt1[0] = 5; // réaffectation 1er élément
		System.out.println(tabInt1[0]); // affichage 1er élément apres réaffectation
		System.out.println(tabInt1[1]); // affichage 2nd élément

		int tabInt2[] = { 45, 55, 65, 75, 85 };

		System.out.println("Parcours tableau TabInt2 (v1)");
		for (int i = 0; i < tabInt2.length; i++) {
			System.out.println(tabInt2[i]);
		}
		System.out.println("Parcours tableau TabInt2 (v2)");
		for (int nb : tabInt2) {
			System.out.println(nb);
		}
	}

}
