package com.crm.formation;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String texte;   			//déclaration variable
		texte = "Bonjour";			//affectation/assignation
																//alternative : String texte = "Bonjour";
		System.out.println(texte);
		texte = "Au revoir";		//(ré)affectation/(ré)assignation
		System.out.println(texte);
		
									//Test de la concaténation
		texte = texte + " Joanna";
		System.out.println(texte);
	}

}
