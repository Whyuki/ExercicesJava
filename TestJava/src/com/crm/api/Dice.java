/**
 * 
 */
package com.crm.api;

import java.util.Random;
import java.util.Scanner;

/**
 * @author joann
 *
 */
public class Dice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * deux joueurs, 3 lancés de dès, si 6 rejouer, somme pour déterminer gagnant
		 */
		Scanner sc = new Scanner(System.in);
		String player1, player2;
		int dice = 0;
		System.out.println("Player 1, please enter your pseudo :");
		player1 = sc.nextLine();
		System.out.println("Player 2, please enter your pseudo :");
		player2 = sc.nextLine();
		System.out.println("Player 1, please roll the dice :");
		// range random 0 inclus !!!
		dice = new Random().nextInt(7);
		System.out.println(dice);

	}

}
