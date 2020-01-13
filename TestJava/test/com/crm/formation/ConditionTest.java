/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
/*
 * 
 * if (estVrai) System.out.println("YES"); (une seule instruction accolades
 * facultatives)
 */
public class ConditionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean estVrai = false;
//		System.out.println("Début programme");
//
//		if (estVrai) { // if (estVrai == true){
//			System.out.println("YES");
//			System.out.println("WE CAN");
//		} else {
//			System.out.println("NO");
//			System.out.println("WE CAN'T");
//		}
//
//		System.out.println("Fin de programme");

		int nb = 1;
		String str = "oki";

		if (nb > 10 && str.equals("ok")) {
			System.out.println("Conditions remplies");
		} else if (nb > 10 || str.equals("ok")) {
			System.out.println("Une des deux conditions est remplie");
		} else {
			System.out.println("Aucune condion n'est remplie");
		}

		if (nb > 10 && str.equals("ok")) {
			System.out.println("Conditions remplies");
		} else {
			if (nb > 10 || str.equals("ok")) {
				System.out.println("Une des deux conditions est remplie");
			} else {
				System.out.println("Aucune condion n'est remplie");
			}

		}

	}

}
