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
		System.out.println("\ntotal :"+total);
		System.out.println("num :"+num);
		System.out.println("pourcentage :"+pourcentage);
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
		System.out.println("pourcentage :"+pourcentage+"\n");
		
		
		
		int var1, var2;
		var1 = 3;
		var2 = 0;
		System.out.println("var1 = " + var1 + "\nvar2 = " + var2);
		var2 = ++var1;
		System.out.println("préfixe ++ : var2 = ++var1 donne: \n" + "var1 = " + var1 + "\nvar2 = " + var2); // incrémentation
																											// avant
																											// (ré)affectation
		var1 = 3;
		var2 = 0;
		System.out.println("Remise à zéro\n" + "var1 = " + var1 + "\nvar2 = " + var2);
		var2 = var1++;
		System.out.println("suffixe ++ : var2 = var1++ donne: \n" + "var1 = " + var1 + "\nvar2 = " + var2); // incrémentation
																											// apres
																											// (ré)affectation

		
		int var3;
		var3 = 8;
		var3--;
		System.out.println("\n"+"var3 = "+var3+"\n\n");
		
		int varBool1, varBool2;
		boolean res;
		varBool1 = 8;
		varBool2 = 15;
		res = true;
		res = (varBool1 == varBool2);
		System.out.println("test boolean : " + res + "\n\n");
		res = (varBool1>varBool2);
		System.out.println("test boolean : " + res + "\n\n");
		res = (varBool1>=varBool2);
		System.out.println("test boolean : " + res + "\n\n");
		res = (varBool1<varBool2);
		System.out.println("test boolean : " + res + "\n\n");
		res = (varBool1<=varBool2);
		System.out.println("test boolean : " + res + "\n\n");
		res = (varBool1!=varBool2);
		System.out.println("test boolean : " + res + "\n\n");

		short nb1, nb2, nb3, nb4;
		nb1 = 3;
		nb2 = 2;
		nb3 = 6;
		nb4 = 6;
		boolean bool1 = nb1>nb2;
		boolean bool2 = nb3==nb4;
		boolean bool3 = bool1 || bool2; // opérateurs logiques : boolean bool3 = bool1 ^ bool2; boolean bool3 = bool1 || bool2; boolean bool3 = !bool2;
		System.out.println(bool3);

		
	}

}
