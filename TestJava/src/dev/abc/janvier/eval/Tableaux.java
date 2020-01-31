package dev.abc.janvier.eval;

/**
 * @author Joanna
 */
/**
 * afficher tableau et reaffectation d'une valeur
 * 
 */
public class Tableaux {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tablow = {0,10,20,30,40,50,60,70,80,90};
		for (int i = 0; i<tablow.length;i++) {
			System.out.println(tablow[i]);
		}
		tablow[9] = 0;
		for (int i = 0; i<tablow.length;i++) {
			System.out.println(tablow[i]);
		}
	}

}
