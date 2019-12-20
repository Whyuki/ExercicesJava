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
		byte b1;
		b1 = 8;
		System.out.println("test byte : "+b1+"\n\n");
		
		short s1;
		s1 = 9;
		System.out.println("test short : "+s1+"\n\n");
		
		int i1;
		i1 = 11;
		System.out.println("test int : "+i1+"\n\n");
		
		
		long l1;
		l1 = 15;
		System.out.println("test long : "+l1+"\n\n");
				
		
		float fl1;
		fl1 = 1.2f;
		System.out.println("test float : "+fl1+"\n\n");
		
		
		double d1;
		d1 = 1.5;
		System.out.println("test double : "+d1+"\n\n");
		
		char c1;
		c1 = 'b';
		System.out.println("test character : "+c1+"\n\n");
		
		
		int varBool1, varBool2;
		boolean res;	
		res = true;
		System.out.println("test boolean : "+res+"\n\n");
		
		
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
		
		
		int var3, var4, x;
		var3 = 15;
		var4 = 2;
		x = var3 % var4;
		System.out.println("\n\nTest modulo : "+var3+" mod "+var4+" = "+x);
		
		int nb1, nb2, totala;
		nb1 = 15;
		nb2 = 50;
		totala = nb1+nb2;
		System.out.println("\nTest addition :\n"+ nb1 +"+"+nb2+" = " + totala);
		
		double f1, f2, totalf;
		f1 = 1.5;
		f2 = 3.2;
		totalf = f1 + f2;
		System.out.println("\n\nTest nombre à virgule : "+f1+" + "+f2+" = "+totalf+"\n");
		
		int total;
		Scanner sc;
		sc = new Scanner(System.in);
		int nb, nbbis;
		System.out.println("Saisir un nombre :");
		nb = sc.nextInt();
		System.out.println("vous avez saisi le nombre "+nb);
		System.out.println("Saisir un second nombre :");
		nbbis = sc.nextInt();
		System.out.println("Votre second nombre est : "+nbbis);
		total = nb + nbbis;
		System.out.println(nb+ " + "+nbbis+" = "+total);
		

	}

}

