/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bonjour !");
		System.out.println("Comment ça va ?");

		{
			int maVariableInt; // nom variable : camelCase
								// interdit = commencer par un chiffre, contenir un espace, mot réservé
			maVariableInt = 2;
			System.out.println(maVariableInt);

			maVariableInt = 10;
			System.out.println(maVariableInt);

			byte maVariableByte = 38;
			short maVariableShort = 1526;
			long maVariableLong = 164848488484848845l; // suffixe lettre L (màj ou min)
			
			System.out.println(maVariableByte);
			System.out.println(maVariableShort);
			System.out.println(maVariableInt);
			System.out.println(maVariableLong);
		}
	float maVariableFloat = 2.5F;
	double maVariableDouble = 15.5444845454784;
	System.out.println(maVariableFloat);
	System.out.println(maVariableDouble);

	char maVariableChar = 'c'; // simple cotes!
	System.out.println(maVariableChar);
	char maVariableChar1 = '\u0059'; // simple cotes!
	System.out.println(maVariableChar1);
//	System.out.println(); // sout + ctrl/space
	
	boolean maVariableBool = true;
	System.out.println(maVariableBool);

	String maChaine1 = "Mon texte"; // String màj : type objet _ double cotes
	String maChaine2 = " est super";
	String maChaine3 = maChaine1+32+maChaine2;
	System.out.println(maChaine3);
	
	}

}
