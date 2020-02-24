package com.crm.bo;

/**
 * @author Joanna
 * Classe Route pour définir un type de route et la limitation de vitesse associée
 */
public class Route {

	private String type;
	private int vitesseMax;

	public Route() {

	}

	public Route(String type, int vitesseMax) {
		this.type = type;
		this.vitesseMax = vitesseMax;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		this.setVitesseMax();
	}

	public int getVitesseMax() {
		return vitesseMax;
	}

	public void setVitesseMax() {
		if (this.type.equalsIgnoreCase("VILLE")) {
			vitesseMax = 50;
		} else if (this.type.equalsIgnoreCase("ROUTE")) {
			vitesseMax = 80;
		} else if (this.type.equalsIgnoreCase("AUTOROUTE")) {
			vitesseMax = 130;
		}
	}

	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}
}
