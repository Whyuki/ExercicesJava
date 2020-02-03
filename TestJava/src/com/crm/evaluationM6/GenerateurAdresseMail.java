package com.crm.evaluationM6;

import java.util.Scanner;

/**
 * @author Joanna
 */
/**
 * générateur adresse mail avec prenom"."nom, tout en minuscule, terminaison "@crm.com"
 *
 */
public class GenerateurAdresseMail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prenom, nom, adresseMail;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir votre prénom :");
		prenom = sc.nextLine();
		System.out.println("Veuillez saisir votre nom :");
		nom = sc.nextLine();
		adresseMail = prenom.toLowerCase() + "." + nom.toLowerCase() + "@crm.com";
		System.out.println("Votre adresse mail : " + adresseMail);
		sc.close();
	}

}
