/**
 * collection : vector
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
		// vector : tableau "redimensionnable"
		Vector groupe = new Vector(); // vide
		Vector groupe1 = new Vector(10); // avec taille initiale (peut être agrandi plus tard)
		
		// collection d'objets de type differents (depuis java 8 : possibilité definir
		// le type d'objets manipulé dans la collection : généricité )
		// exemple :
		//		Vector<Personne> groupe = new Vector(); 

		Personne michael = new Personne("Mimi", "Jordan", "Michael");
		Personne lebron = new Personne("Jaja", "Lebron", "James");
		Personne kobe = new Personne("Bibi", "Kobe", "Bryant");
		
		Personne idk = new Personne("I","DON'T","KNOW");
		
		//ajouter des éléments (à la suite)
		groupe.addElement(michael);
		groupe.addElement(lebron);
		groupe.addElement(kobe);

		//ajouter élément posit° spécifique
		groupe.insertElementAt(idk, 3);
		
		// supprimer élément spécifique
		groupe.remove(3);
		((Personne) groupe.get(0)).afficherDetails();
		
		
		Personne unBasketteur1 = (Personne) groupe.get(0); // cast (Personne)
		System.out.println(unBasketteur1.getNom());
		System.out.println("L'équipe a " + groupe.size() + " joueurs.");
		
		System.out.println("Indice : "+ (groupe.indexOf(lebron)));
		
		lebron.surnom="The king";
		System.out.println("Le surnom de Lebron James est " + lebron.surnom);
		Personne lebronModifié = (Personne)groupe.get(1); // objet dupliqué ?s
		System.out.println("Le surnom de Lebron James est " + lebronModifié.surnom);
		lebronModifié.surnom="The biggest";
		System.out.println("Le surnom de Lebron James est " + lebron.surnom);
		
		System.out.println("Indice : "+ (groupe.indexOf(lebron)));
		System.out.println("Indice : "+ (groupe.indexOf(lebronModifié)));
		
		System.out.println("Indice : "+ (groupe.indexOf(kobe)));
		

//		for (int i = 0; i < groupe.size(); i++) {
//			((Personne) groupe.get(i)).afficherDetails("fr");
//		}
	}
}
