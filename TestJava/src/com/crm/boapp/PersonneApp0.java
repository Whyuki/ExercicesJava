/**
 * sans interraction user
 */
package com.crm.boapp;

import com.crm.bo.Personne;

/**
 * @author Joanna
 *
 */
public class PersonneApp0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne pers1 = new Personne();
		pers1.afficherDetails();
		pers1.surnom = "Jojo";
		pers1.setNom("Schmitt");
		pers1.setPrenom("Joanna");
		pers1.afficherDetails();
		Personne.modifierPersonne(pers1); //method static : param objet : modification de l'objet
		pers1.afficherDetails();

		System.out.println();
		Personne pers2 = new Personne("jojo", "schmitt", "joanna");
		
		System.out.println();
		pers2.afficherDetails();
		pers2.majusc();
		pers2.afficherDetails();
		
		// exeption dereferencement de l'objet
//		Personne pers3 = new Personne();
//		pers3 = null;
//		System.out.println(pers3.getNom());

		int a = 5;
		int b = 5;
		if (a == b) {
			System.out.println("les 2 entiers sont identiques");
		}

		// comparaison == sur un objet : comparaison de reference et non de valeur
		Personne pers4 = new Personne("jojo", "schmitt", "joanna");
		Personne pers5 = new Personne("jojo", "schmitt", "joanna");
		System.out.println("ref pers4" + pers4);
		System.out.println("ref pers5" + pers5);
		if (pers4 == pers5) {
			System.out.println("les 2 références sont identiques"); // impossible
		}

		if (pers4.isEquals(pers5)) {
			System.out.println("Les deux objets sont identiques (nom et prenom idem) (method isEquals)");
		}
		
		int n = 5;
		pers1.incrementeNombre(n); // param type primitif ne modifie pas la variable
		System.out.println(n);
		
	}
		

}
