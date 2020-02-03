package com.crm.evaluationM6;

/**
 * @author Joanna
 */
/** 
 *         méthode prenant une chaîne de caractères en paramètre et affichant la
 *         longueur de cette chaîne
 *
 */
public class Procédure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaineAAfficher = "ok !";
		afficherLongueurChaine(chaineAAfficher);
	}

	public static void afficherLongueurChaine(String str) {
		System.out.println("La longueur de cette chaine de caractères est de : " + str.length());
	}

}
