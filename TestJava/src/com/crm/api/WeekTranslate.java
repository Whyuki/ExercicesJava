package com.crm.api;

import java.util.Scanner;

/**
 * @author Joanna
 */
/**
 * traduction jours de la semaine en anglais et allemand, avec tableau deux dimensions 
 *
 */
public class WeekTranslate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String[][] SEMAINE_WEEK_WOCHE = {
				{ "Français", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" },
				{ "English", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" },
				{ "Deutsch", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag" } };
		final int INDEX_FR = 0;
		final int INDEX_EN = 1;
		final int INDEX_DE = 2;
		String word, langu;
		String onOff = "Y";
		Scanner sc = new Scanner(System.in);
		int index;

		// permet à l'utilisateur d'éffectuer une autre traduction
		while (onOff.equalsIgnoreCase("Y") || onOff.equalsIgnoreCase("O") || onOff.equalsIgnoreCase("J")) {
			System.out.println("FR/EN/DE ?");
			langu = sc.nextLine();
			if (langu.equalsIgnoreCase("FR")) {
				System.out.println("Veuillez saisir un jour de la semaine :");
				word = sc.nextLine();
				index = Utils.foundIndex(SEMAINE_WEEK_WOCHE, word, INDEX_FR); // recherche du mot dans le tableau FR et
																				// retour de l'index
				if (index >= 0) {
					System.out.println("English : " + SEMAINE_WEEK_WOCHE[INDEX_EN][index]);
					System.out.println("Deutsch : " + SEMAINE_WEEK_WOCHE[INDEX_DE][index]);

					System.out.println("\nContinuer ? O/N");
					onOff = sc.nextLine();
				} else { // si indice < 0 : mot non présent dans le tableau
					System.out.println("Mot invalide");
				}
			} else if (langu.equalsIgnoreCase("EN")) {
				System.out.println("Please enter a day of the week :");
				word = sc.nextLine();
				index = Utils.foundIndex(SEMAINE_WEEK_WOCHE, word, INDEX_EN);
				if (index >= 0) {
					System.out.println("Français : " + SEMAINE_WEEK_WOCHE[INDEX_FR][index]);
					System.out.println("Deutsch : " + SEMAINE_WEEK_WOCHE[INDEX_DE][index]);

					System.out.println("\nAnother one ? Y/N");
					onOff = sc.nextLine();
				} else {
					System.out.println("RIP");
				}
			} else if (langu.equalsIgnoreCase("DE")) {
				System.out.println("Bitte geben Sie einen Wochentag :");
				word = sc.nextLine();
				index = Utils.foundIndex(SEMAINE_WEEK_WOCHE, word, INDEX_DE);
				if (index >= 0) {

					System.out.println("Français : " + SEMAINE_WEEK_WOCHE[INDEX_FR][index]);
					System.out.println("English : " + SEMAINE_WEEK_WOCHE[INDEX_EN][index]);

					System.out.println("\nFortsetzen ? J/N");
					onOff = sc.nextLine();
				} else {
					System.out.println("Nein, nein, nein !");
				}
			} else {
				System.out.println("Error");
			}
		}
		sc.close();
	}
}
