package com.crm.api;

/**
 * @author Joanna
 */
/** 
 * split string en tableau de string avec le séparateur indiqué
 * 
 */
public class splitString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// chaine de caractère à splitter 
		String strToSplit = "toto,titti,tata";
		
		// le  résultat du split est stocké dans un tableau
		String[] tabSplit = strToSplit.split(",");
		
		// parcours du tableau avec séparateur
		for (String str : tabSplit) {
			System.out.println(str);
		}
	}

}
// retourne un tableau