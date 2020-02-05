package com.crm.boapp;

import com.crm.bo.Film;

/**
 * constructeur par defaut et avec parametres
 * 
 * @author Joanna
 *
 */

public class FilmApp0 {

	public static void main(String[] args) {
		// constructeur par défaut
		Film flim1 = new Film();
		flim1.afficherDetails();
		flim1.setTitre("Your name");
		flim1.setClassif("all public");
		flim1.setType("japanese animation");

		flim1.afficherDetails();
		
		// constructeur avec parametre
		Film flim2 = new Film("Harry Potter", "Fantasy", "all public");
		flim2.afficherDetails();

	}

}
