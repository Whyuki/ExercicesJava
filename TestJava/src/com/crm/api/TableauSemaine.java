/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class TableauSemaine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String semaine[] = { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" };
		String week[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		String answer;
//		System.out.println("\nFrançais : ");
//		for (i = 0; i < semaine.length; i++) {
//			System.out.println(semaine[i]);
//		}
//		System.out.println("\nEnglish : ");
//		for (i = 0; i < week.length; i++) {
//			System.out.println(week[i]);
//		}

		System.out.println("Veuillez saisir un jour de la semaine en français: ");
		answer = sc.nextLine();
		for (int i = 0; i < semaine.length; i++) {
			if (answer.equalsIgnoreCase(semaine[i])) {
				System.out.println(semaine[i] + " = " + week[i]);
				break;
			}
		}

		System.out.println("\nPlease enter a day of the week in English: ");
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
