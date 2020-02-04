package com.crm.boapp;

import com.crm.bo.Film;

/**
 * @author Joanna
 *
 */

public class FilmApp {

	public static void main(String[] args) {

		Film flim1 = new Film();
		flim1.setTitre("Your name");
		flim1.setClassif("all public");
		flim1.setType("japanese animation");

		flim1.afficherDetails();

	}

}
