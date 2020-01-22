/**
 * 
 */
package com.crm.formation;

/**
 * @author Joanna
 *
 */
public class RandomTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// generation random avec Math.random entre 0 et 100 ?
		int r = (int) (Math.random() * 1000000) % 6;
		System.out.println(r);
	}

}
