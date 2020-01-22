/**
 * 
 */
package com.crm.formation;

/**
 * @author Joanna
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
				System.out.println("ok");
//				break;					  //quitte la boucle et exécute la suite des instruction de la method
				continue;     			 //continue la boucle = si la condition est remplie, ignore les instructions de la boucle et passe à l'étaration suivante
//				return; 				// quitte/ferme la méthode : donc n'exécute pas la suite des instructions ..."
			
			}
			System.out.println(i);
		}
		System.out.println("Fin méthode afficherListeNombre");

	}
}
