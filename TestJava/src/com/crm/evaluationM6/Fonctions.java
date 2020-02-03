package com.crm.evaluationM6;

/**
 * @author Joanna
 */
/** 
 *         méthode prenant un entier en paramètre et retournant la
 *         multiplication de cet entier par 2
 *
 */
public class Fonctions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int entierAdoubler = 5, doublette = 0;
		doublette = multParDeux(entierAdoubler);
		System.out.println(doublette);

	}

	public static int multParDeux(int nb) {
		int d = nb * 2;
		return d;
	}

}
