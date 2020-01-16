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
//				break;
//				continue;      //continue la boucle exemple n'affiche pas le 5 = ignore
				return; // quitte/ferme la méthode : donc n'affiche pas "fin méthode ..."
			}
			System.out.println(i);
		}
		System.out.println("Fin méthode afficherListeNombre");

	}
}
