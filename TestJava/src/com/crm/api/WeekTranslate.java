/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author Joanna
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
		String word, langu;
		String onOff = "Y";
		Scanner sc = new Scanner(System.in);
		int index;

		while (onOff.equalsIgnoreCase("Y") || onOff.equalsIgnoreCase("O") || onOff.equalsIgnoreCase("J")) {
			System.out.println("FR/EN/DE ?");
			langu = sc.nextLine();
			if (langu.equalsIgnoreCase("FR")) {
				System.out.println("Veuillez saisir un jour de la semaine :");
				word = sc.nextLine();
				index = foundIndex(SEMAINE_WEEK_WOCHE, word, 0);
				System.out.println("English : " + SEMAINE_WEEK_WOCHE[1][index]);
				System.out.println("Deutsch : " + SEMAINE_WEEK_WOCHE[2][index]);

				System.out.println("\nContinuer ? O/N");
				onOff = sc.nextLine();
			} else if (langu.equalsIgnoreCase("EN")) {
				System.out.println("Please enter a day of the week :");
				word = sc.nextLine();
				index = foundIndex(SEMAINE_WEEK_WOCHE, word, 1);
				System.out.println("Français : " + SEMAINE_WEEK_WOCHE[0][index]);
				System.out.println("Deutsch : " + SEMAINE_WEEK_WOCHE[2][index]);

				System.out.println("\nAnother one ? Y/N");
				onOff = sc.nextLine();
			} else if (langu.equalsIgnoreCase("DE")) {
				System.out.println("Bitte geben Sie einen Wochentag :");
				word = sc.nextLine();
				index = foundIndex(SEMAINE_WEEK_WOCHE, word, 2);
				System.out.println("Français : " + SEMAINE_WEEK_WOCHE[0][index]);
				System.out.println("English : " + SEMAINE_WEEK_WOCHE[1][index]);

				System.out.println("\nFortsetzen ? J/N");
				onOff = sc.nextLine();
			} else {
				System.out.println("Error");
			}
		}
		sc.close();
	}

	public static int foundIndex(String[][] array, String str, int indiceTab) {
		int ind = -1;
		for (int j = 0; j < array[indiceTab].length; j++) {
			if (str.equalsIgnoreCase(array[indiceTab][j])) {
				ind = j;
				break;
			}
		}

		return ind;
	}

}
