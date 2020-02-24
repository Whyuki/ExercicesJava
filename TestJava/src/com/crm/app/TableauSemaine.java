package com.crm.app;

import java.util.Scanner;

/**
 * traduction jour de la semaine fr-en et en-fr, tableau une dimension
 * @author Joanna
 */
public class TableauSemaine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] semaine = { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" };
		String week[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		String answer;
		
		System.out.println("Français : ");
		for (int i = 0; i < semaine.length; i++) {
			System.out.println(semaine[i]);
		}
		System.out.println("\nEnglish : ");
		for (String nb : week) {
			System.out.println(nb);
		}
		System.out.println("\nFrançais (à l'envers) : ");
		for (int i = semaine.length-1; i >=0; i--) {
			System.out.println(semaine[i]);
		}
		System.out.println("\nEnglish (reverse) : ");
		for (int i = week.length-1; i >=0; i--) {
			System.out.println(week[i]);
		}
		
		System.out.println("\nVeuillez saisir un jour de la semaine en français pour le traduire en anglais : ");
		answer = sc.nextLine();
		for (int i = 0; i < semaine.length; i++) {
			if (answer.equalsIgnoreCase(semaine[i])) {
				System.out.println(semaine[i] + " = " + week[i]);
				break;
			}
		}

		System.out.println("\nPlease enter a day of the week in English to translate it into French : ");
		answer = sc.nextLine();
		for (int i = 0; i < week.length; i++) {
			if (answer.equalsIgnoreCase(week[i])) {
				System.out.println(week[i] + " = " + semaine[i]);
				break;
			}
		}

		sc.close();

	}

}
