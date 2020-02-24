package com.crm.app;

/**
 * @author Joanna
 */
/**
 * args main, afficher longueur du tableau args
 *
 */
public class ArgumentMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args != null) {
			System.out.println("La taille du tableau args est : " + args.length);

			for (String str : args) {
				System.out.println(str);
			}
		}
	}

}
