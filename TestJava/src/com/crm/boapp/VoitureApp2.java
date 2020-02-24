package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Voiture1;

/**
 * Classe applicative test de la classe Voiture1 avec interraction et attribut de type Route (type et vitesse max)
 * @author Joanna
 * @version VoitureAPP v2
 * 
 */
public class VoitureApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String choix;

		Voiture1 titine = new Voiture1("Fiat", "noir", 3, "manuelle", 7000);

		System.out.println("Bonjour, prennez place au volant de cette voiture, voici ces caractéristiques : ");
		titine.afficherDetails();

		System.out.println("Souhaitez vous la démarrer ? O/N");
		if (sc.nextLine().equalsIgnoreCase("O")) {
			titine.demarrage();
			System.out.println("Veuillez saisir le type de route : ville / route / autoroute :");
			titine.getRoute().setType(sc.nextLine());
			System.out.println("\nVous êtes sur une route de type " + titine.getRoute().getType()
					+ " : Vitesse limitiée à " + titine.getRoute().getVitesseMax() + "km/h");
		}
		while (titine.isMarche() == true) {

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
				titine.accelerer(Integer.parseInt(sc.nextLine()), titine.getRoute());
				break;
			case "2":
				System.out.println("De combien souhaitez vous ralentir ?");
				titine.ralentir(Integer.parseInt(sc.nextLine()));
				break;
			case "3":
				titine.klaxonner();
				break;
			case "4":
				System.out.println("Veuillez saisir le type de route : ville / route / autoroute :");
				titine.getRoute().setType(sc.nextLine());
				System.out.println("\nVous êtes sur une route de type " + titine.getRoute().getType()
						+ " : Vitesse limitiée à " + titine.getRoute().getVitesseMax() + "km/h");
				break;
			case "5":
				titine.arret();
				break;
			default:
				System.out.println("Commande inconnue");
				break;
			}
			titine.controleVitesse(titine.getRoute());
		}
		System.out.println("Au revoir !");
		sc.close();
	}

}
