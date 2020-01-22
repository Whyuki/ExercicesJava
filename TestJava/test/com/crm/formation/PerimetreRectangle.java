package com.crm.formation;
import java.util.Scanner;

/**
 * 
 */
//PERIMETRE RECTANGLE AVEC FORMULE
/**
 * @author Joanna
 *
 */
public class PerimetreRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		sc = new Scanner(System.in);
		float longueurRectangle, largeurRectangle, perimetreRectangle;
		System.out.println("Veuillez saisir la longueur du rectangle ");
		longueurRectangle = sc.nextFloat();
		System.out.println("Veuillez saisir la largeur du rectangle");
		largeurRectangle = sc.nextFloat();
		perimetreRectangle = (longueurRectangle + largeurRectangle)*2f;
		System.out.println("Longueur du rectangle : "+longueurRectangle+"cm \nLargeur du rectangle : "+largeurRectangle+"cm \nPérimètre du rectangle : "+perimetreRectangle+"cm");
		sc.close();
		
	}

}
