package dev.abc.janvier.eval;

import java.util.Scanner;

/**
 * @author Joanna
 */
/**
 * convertir euro en dollar avec taux de change connu
 *
 */
public class ConvertisseurEuroDollar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double montantEuro = 0, montantDollar = 0;
		final float TAUX_CHANGE = 1.11f;
		Scanner sc = new Scanner(System.in);
		while (montantEuro <= 0) {
			System.out.println("Veuillez saisir le montant en euro :");
			montantEuro = sc.nextDouble();
			if (montantEuro < 0) {
				System.out.println("Montant invalide !");
			}
		}
		montantDollar = montantEuro * TAUX_CHANGE;
		System.out.println(montantEuro + "€ = " + montantDollar + "$");
		sc.close();
	}

}
