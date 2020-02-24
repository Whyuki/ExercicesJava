package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Voiture;

/**
 * classe test avec interraction
 * @author Joanna
 *
 */
public class VoitureApp1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String choix;

		Voiture tuture = new Voiture("Fiat", "noir", 3, "manuelle", 7000);

		System.out.println("Bonjour, prennez place au volant de cette voiture, voici ces caractéristiques : ");
		tuture.afficherDetails();

		System.out.println("Souhaitez vous la démarrer ? O/N");
		if (sc.nextLine().equalsIgnoreCase("O")) {
			tuture.demarrage();
			System.out.println("Veuillez saisir le type de route : ville / route / autoroute :");
			tuture.setTypeRoute(sc.nextLine());
		}
		while (tuture.isMarche() == true) {
			System.out.println();
			System.out.println("Veuillez choisir l'action : ");
			System.out.println("Pour accélérer tapez : 1 ");
			System.out.println("Pour freiner tapez : 2 ");
			System.out.println("Pour klaxonner tapez : 3 ");
			System.out.println("Pour changer de type de route, Tapez 4 ");
			System.out.println("Pour vous arrêter tapez : 5 ");
			choix = sc.nextLine();
			switch (choix) {
			case "1":
				System.out.println("De combien souhaitez vous accélérer ?");
				tuture.accelerer(Integer.parseInt(sc.nextLine()), tuture.getTypeRoute());
				break;
			case "2":
				System.out.println("De combien souhaitez vous ralentir ?");
				tuture.ralentir(Integer.parseInt(sc.nextLine()));
				break;
			case "3":
				tuture.klaxonner();
				break;
			case "4":
				System.out.println("Veuillez saisir le type de route : ville / route / autoroute :");
				tuture.setTypeRoute(sc.nextLine());
				break;
			case "5":
				tuture.arret();
				break;
			default:
				System.out.println("Commande inconnue");
				break;
			}
			tuture.controleVitesse(tuture.getTypeRoute());
		}
		sc.close();
	}

}
