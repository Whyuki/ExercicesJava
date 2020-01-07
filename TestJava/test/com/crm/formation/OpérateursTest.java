/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class OpérateursTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int maVariableInt1;
		maVariableInt1 = 36; // opérateur d'affectation (ou d'assignement) : =
		System.out.println(maVariableInt1);
		
		int maVariableInt2;
		maVariableInt2 = maVariableInt1;
		System.out.println(maVariableInt2);
		
		int maVariableInt3;
		maVariableInt3 = maVariableInt2 = maVariableInt1 = 58; // assignement de droite à gauche
		System.out.println(maVariableInt1);
		System.out.println(maVariableInt2);
		System.out.println(maVariableInt3);
		
		int somme1;
		somme1 = 5 + 6;
		System.out.println(somme1);
		
		int somme2;
		somme2 = somme1 + 7;
		System.out.println(somme2);
		
		int sous1;
		sous1 = 5-2;
		System.out.println(sous1);
		
		int prod1;
		prod1 = 5*3;
		System.out.println(prod1);
		
		float produit2;
		produit2 = 5.2f*3;
		System.out.println(produit2);
		
		float quotient1;
		quotient1 = 4.3f/3.2f;
		System.out.println(quotient1);
		
		int quotient2;
		quotient2 = 5/2;
		System.out.println(quotient2); //arrondi
		
		float quotient3;
		quotient3 = 5f/2; // f !!!
		System.out.println(quotient3);
		
		int modulo1;
		modulo1 = 5 % 2;
		System.out.println(modulo1);
		
		double total, num, pourcentage;
		total =5;
		num = 1;
		pourcentage =0.5;
		total = total + num;
		System.out.println("\ntotal :"+total);
		System.out.println("num :"+num);
		System.out.println("pourcentage :"+pourcentage);
		total +=num;
		System.out.println("\ntotal :"+total);
		System.out.println("num :"+num);
		System.out.println("pourcentage :"+pourcentage);
		total -= num;
		System.out.println("\ntotal :"+total);
		System.out.println("num :"+num);
		System.out.println("pourcentage :"+pourcentage);
		total *= pourcentage;
		System.out.println("\ntotal :"+total);
		System.out.println("num :"+num);
		System.out.println("pourcentage :"+pourcentage);
		total /=2;
		System.out.println("\ntotal :"+total);
		System.out.println("num :"+num);
		System.out.println("pourcentage :"+pourcentage);
		num %= pourcentage;
		System.out.println("\ntotal :"+total);
		System.out.println("num :"+num);
		System.out.println("pourcentage :"+pourcentage);
		
	}

}
