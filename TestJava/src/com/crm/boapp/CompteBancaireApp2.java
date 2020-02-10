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
		System.out.println("Bonjour,");
		while (onOff.equalsIgnoreCase("o")) {
			System.out.println("Quel opération souhaitez vous effectuer ? " + "\n1 Retrait" + "\n2 Depot"
					+ "\n3 Afficher détails" + "\nTapez 1, 2 ou 3 :");

			command = sc.nextLine();
			switch (command) {
			case "1":
				System.out.println("Combien souhaitez vous retirer ?");
				if (comptA.retrait(Integer.parseInt(sc.nextLine())) == true) {
					System.out.println("Retrait effectué, nouveau solde : " + comptA.getSolde());
				} else {
					System.out.println("Retrait impossible, depassement du découvert autorisé !" + "\nSolde : "
							+ comptA.getSolde());
				}
				break;
			case "2":
				System.out.println("Combien souhaitez vous deposer ?");
				comptA.depot(Integer.parseInt(sc.nextLine()));
				System.out.println("Depot effectué, nouveau solde : " + comptA.getSolde());
				break;
			case "3":
//				comptA.afficherDetails();
				System.out.println("\nNumero de compte : " + comptA.getNumeroCompte());
				System.out.println("Solde : " + comptA.getSolde());
				break;
			default:
				break;
			}
			System.out.println("\nSouhaitez vous effectuer une autre opération ? O/N");
			onOff = sc.nextLine();
		}
		System.out.println("Au revoir.");
		sc.close();
	}

}
