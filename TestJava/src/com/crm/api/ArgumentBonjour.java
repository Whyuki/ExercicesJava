/**
 * 
 */
package com.crm.api;

/**
 * @author Joanna
 *
 */
public class ArgumentBonjour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length == 4) {
			System.out.println("Bienvenue " + args[0] + " " + args[1] + " " + args[2]);
			System.out.println("Il est " + args[3]);
		}

	}

}
