/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author Joanna
 *
 */
public class AppliWrapperTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter a number");
		String str;
		str = sc.nextLine();
		int i = Integer.parseInt(str);
		i++;
		System.out.println("string : "+str+"\ni : "+i);
		sc.close();
	}

}
