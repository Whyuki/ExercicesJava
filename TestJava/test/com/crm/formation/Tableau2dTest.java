/**
 * 
 */
package com.crm.formation;

/**
 * @author Joanna
 *
 */
public class Tableau2dTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// déclaration d'un tableau à 2 dimensions
		int[][] tab2d = new int[2][3];

		// affectation
		tab2d[0][0] = 4;
		System.out.println(tab2d[0][0]);

		// déclaration avec initialisation
		int[][] tab2dim = { { 1, 3, 5 }, { 0, 2, 4 } };

		// Accès aux éléments
		System.out.println("élément [0][0] de tab2dim  : " + tab2dim[0][0]); // 1er tableau, 1er élément
		System.out.println("élément [1][2] de tab2dim  : " + tab2dim[1][2]); // 2nd tableau, 3ème élément

		// Modification des éléments
		tab2dim[1][2] = 6;
		System.out.println("élément [1][2] de tab2dim après modification : " + tab2dim[1][2]); // 2nd tableau, 3ème
																								// élément

		//
		int[][] tablow2d = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 } };
		System.out.println("\nélément [2][2] de tablow2d : " + tablow2d[2][2]); // 3ème tableau, 3ème élément

		// longueur de tableau ( = nombre de tableau/ligne)
		System.out.println("longueur tableau tab2dim " + tab2dim.length);
		System.out.println("longueur tableau tablow2d " + tablow2d.length);

		// nombre de colonnes :
		System.out.println("colonnes (longueur de la ligne) : " + tablow2d[0].length);

		// Parcours du tableau
		System.out.println("\nParcours du tableau tab2dim :");
		for (int i = 0; i < tab2dim.length; i++) {
			for (int j = 0; j < tab2dim[i].length; j++) {
				System.out.println("élément [" + i + "][" + j + "] : " + tab2dim[i][j]);
			}
		}

	}

}
