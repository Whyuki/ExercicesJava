/**
 * 
 */
package com.crm.api;

/**
 * @author Joanna
 *
 */
public class ArgumentMainSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] argument0 = args[0].split("=");
		String[] argument1 = args[1].split("=");


		if (args.length == 2) {
			if (argument0[0].equals("prenom")) {		
				System.out.println("Bienvenue " + argument0[1] + " " + argument1[1]);
			} else {
				System.out.println("Bienvenue " + argument1[1] + " " + argument0[1]);
			}
		}
	}

}
