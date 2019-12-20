/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class TypePrimitifTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1, var2;
		var1 = 3;
		var2 = 0;
		System.out.println("var1 = "+var1+"\nvar2 = "+var2);	
		var2 = ++var1;
		System.out.println("préfixe ++ : var2 = ++var1 donne: \n"+"var1 = "+var1+"\nvar2 = "+var2); //incrémentation avant (ré)affectation
		var1 = 3;
		var2 = 0;
		System.out.println("Remise à zéro\n"+"var1 = "+var1+"\nvar2 = "+var2);
		var2 = var1++;
		System.out.println("suffixe ++ : var2 = var1++ donne: \n"+"var1 = "+var1+"\nvar2 = "+var2); //incrémentation apres (ré)affectation
		
		int nb1, nb2, total, mood;
		nb1 = 15;
		nb2 = 50;
		total = nb1+nb2;
		System.out.println("\nTest addition :\n"+ nb1 +"+"+nb2+" = " + total);
		
		double f1, f2, totalf;
		f1 = 1.5;
		f2 = 3.2;
		totalf = f1 + f2;
		System.out.println("\n\n"+f1+" + "+f2+" = "+totalf+"\n");
		
	}

}

