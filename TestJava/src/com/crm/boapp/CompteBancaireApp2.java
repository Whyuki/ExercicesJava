/**
 * Class application CompteBancaire
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
		CompteBancaire comptA = new CompteBancaire();
		String command = "";
		String onOff = "O";
		System.out.println("Bonjour.");
		while (onOff.equalsIgnoreCase("o")) {
			System.out.println(
					"Quel opération souhaitez vous effectuer ? 1/2/3" + "\n1 Retrait" + "\n2 Depot" + "\n3 Afficher détails");

			command = sc.nextLine();
			switch (command) {
			case "1":
				System.out.println("Combien souhaitez vous retirer ?");
				comptA.retrait(Integer.parseInt(sc.nextLine()));
				break;
			case "2":
				System.out.println("Combien souhaitez vous deposer ?");
				comptA.depot(Integer.parseInt(sc.nextLine()));
				break;
			case "3":
				comptA.afficherDetails();
				break;
			}
			System.out.println("\nSouhaitez vous effectuer une autre opération ? O/N");
			onOff = sc.nextLine();
		}
		System.out.println("Au revoir.");
		sc.close();
	}

}
