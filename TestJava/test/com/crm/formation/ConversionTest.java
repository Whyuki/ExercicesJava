/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
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

	}

}
