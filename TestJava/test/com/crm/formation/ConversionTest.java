/**
 * 
 */
package com.crm.formation;

/**
 * @author Joanna
 *
 */
public class ConversionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 123456;
		long y = x;
		System.out.println("x : "+x+"\ny : "+y);

					//conversion implicite
		
		int a = 65537;
		short z = (short)a;
		System.out.println("a : "+a+"\nz : "+z);
					//conversion explicite

		long l1 = 123456789;
		long l2 = 123456788;
		float f1 = l1;
		float f2 = l2;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(l1 - l2);
		System.out.println(f1 - f2);

										// perte de précision entrainant une erreur
	}

}
