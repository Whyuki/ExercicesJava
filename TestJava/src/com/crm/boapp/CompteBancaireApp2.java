/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.CompteBancaire;

/**
 * @author Joanna
 *
 */
public class CompteBancaireApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CompteBancaire comptA = new CompteBancaire("1234567890");
		String command = "";
		String onOff = "O";
		System.out.println("Bonjour.");
		while (onOff.equalsIgnoreCase("o")) {
			System.out.println(
					"Quel opération souhaitez vous effectuer ?" + "\n1 Retrait" + "\n2 Depot" + "\n3 Afficher détails");
			command = sc.nextLine();

			if (command.equalsIgnoreCase("retrait") || command.equals("1")) {
				System.out.println("Combien souhaitez vous retirer ?");
				comptA.retrait(Integer.parseInt(sc.nextLine()));
			} else if (command.equalsIgnoreCase("depot") || command.equals("2")) {
				System.out.println("Combien souhaitez vous deposer ?");
				comptA.depot(Integer.parseInt(sc.nextLine()));
			} else if (command.equalsIgnoreCase("afficher détails") || command.equals("3")) {
				comptA.afficherDetails();
			}
			System.out.println("Souhaitez vous effectuer une autre opération ? O/N");
			onOff = sc.nextLine();
		}

		System.out.println("Au revoir.");
		sc.close();
	}

}
