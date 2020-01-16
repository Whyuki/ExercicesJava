/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class InstructionReturnTest { // class

	/**
	 * @param args
	 */
	public static void main(String[] args) { // méthode main
		// TODO Auto-generated method stub
		int nombre = 10;
		afficherListeNombre(nombre);

	}

	public static void afficherListeNombre(int nb) { // méthode afficherListeNombre
		System.out.println("Début méthode afficherListeNombre");
		for (int i = 0; i < nb; i++) {
			if (i == 5) {
				break;					  //quitte la boucle et exécute la suite des instruction de la méthode
//				continue;     			 //continue la boucle = ignore si la condition est remplie
//				return; 				// quitte/ferme la méthode : donc n'exécute pas la suite des instructions ..."
			}
			System.out.println(i);
		}
		System.out.println("Fin méthode afficherListeNombre");

	}
}
