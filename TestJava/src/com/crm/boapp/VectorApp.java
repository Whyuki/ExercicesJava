/**
 * 
 */
package com.crm.boapp;

import java.util.Vector;

import com.crm.bo.Personne;

/**
 * @author Joanna
 *
 */
public class VectorApp {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unused", "unchecked" }) // ignorer les warnings
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector groupe = new Vector();
		// collection d'objets de type differents (depuis java 8 : possibilité definir
		// le type d'objets manipulé dans la collection : généricité )
		// exemple :
//		Vector<Personne> groupe = new Vector(); 

		Personne michael = new Personne("", "Jordan", "Michael");
		Personne lebron = new Personne("", "Lebron", "James");
		Personne kobe = new Personne("", "Kobe", "Bryant");

		groupe.addElement(michael);
		groupe.addElement(lebron);
		groupe.addElement(kobe);

		Personne unBasketteur1 = (Personne) groupe.get(0); // cast (Personne)
		System.out.println(unBasketteur1.getNom());
		System.out.println("L'équipe a " + groupe.size() + " joueurs.");
		
		System.out.println("Indice : "+ (groupe.indexOf(lebron)));
		
		lebron.surnom="The king";
		System.out.println("Le surnom de Lebron James est " + lebron.surnom);
		Personne lebronModifié = (Personne)groupe.get(1); // duplique l'objet positionner au même indice ???
		System.out.println("Le surnom de Lebron James est " + lebronModifié.surnom);
		lebronModifié.surnom="The biggest";
		System.out.println("Le surnom de Lebron James est " + lebron.surnom);
		
		System.out.println("Indice : "+ (groupe.indexOf(lebron)));
		System.out.println("Indice : "+ (groupe.indexOf(lebronModifié)));
		
		System.out.println("Indice : "+ (groupe.indexOf(kobe)));
		

		for (int i = 0; i < groupe.size(); i++) {
			((Personne) groupe.get(i)).afficherDetails("fr");
		}
	}
}
