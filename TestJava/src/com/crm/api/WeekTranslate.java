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
		String[][] semaineWeek = {
				{ "Français", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" },
				{ "English", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" },
				{ "Deutsch", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag" } };
		String answer, langu;
		String onOff = "Y";
		Scanner sc = new Scanner(System.in);
		int index;

		while (onOff.equalsIgnoreCase("Y") || onOff.equalsIgnoreCase("O") || onOff.equalsIgnoreCase("J")) {
			System.out.println("FR/EN/DE ?");
			langu = sc.nextLine();
			if (langu.equalsIgnoreCase("FR")) {
				System.out.println("Veuillez saisir un jour de la semaine :");
				answer = sc.nextLine();
				index = foundInd(semaineWeek, answer);
				System.out.println("English : " + semaineWeek[1][index]);
				System.out.println("Deutsch : " + semaineWeek[2][index]);

				System.out.println("\nContinuer ? O/N");
				onOff = sc.nextLine();
			} else if (langu.equalsIgnoreCase("EN")) {
				System.out.println("Please enter a day of the week :");
				answer = sc.nextLine();
				index = foundInd(semaineWeek, answer);
				System.out.println("Français : " + semaineWeek[0][index]);
				System.out.println("Deutsch : " + semaineWeek[2][index]);

				System.out.println("\nAnother one ? Y/N");
				onOff = sc.nextLine();
			} else if (langu.equalsIgnoreCase("DE")) {
				System.out.println("Bitte geben Sie einen Wochentag :");
				answer = sc.nextLine();
				index = foundInd(semaineWeek, answer);
				System.out.println("Français : " + semaineWeek[0][index]);
				System.out.println("English : " + semaineWeek[1][index]);

				System.out.println("\nFortsetzen ? J/N");
				onOff = sc.nextLine();
			} else {
				System.out.println("Error");
			}
		}
		sc.close();

	}

	public static int foundInd(String[][] array, String str) {
		int ind = -1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (str.equalsIgnoreCase(array[i][j])) {
					ind = j;
				}
			}
		}
		return ind;
	}

}
