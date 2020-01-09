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
		
		String str = "Java is fun !! ";
		// équivalent : String str = new String("Java is fun !");

		//Longueur de la chaine
		System.out.println(str.length()); 
		System.out.println(str);
		
		// Mettre en maj
		String str2 = str.toUpperCase();
		System.out.println(str2);
	
		// Suppression des caractères blanc en debut et fin
		String str3 = str.trim();
		System.out.println(str3);
		System.out.println(str3.length());
		
		//remplacer des caractères
		String str4 = str.replace('a','e');
		System.out.println(str4);
		
		//Extraction d'une sous-chaine
		String str5 = str.substring(0, 3);
		System.out.println(str5);
		
		// supprimer blancs
		String str6 = str.replaceAll(" ",""); // space " " ou "\\s"
		System.out.println(str6);
	}
	
}
