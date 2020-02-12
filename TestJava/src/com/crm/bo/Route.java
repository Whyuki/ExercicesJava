/**
 * 
 */
package com.crm.bo;

/**
 * @author Joanna
 *
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
	}

	public int getVitesseMax() {
		return vitesseMax;
	}

	public void setVitesseMax() {
		if (this.type.equals("VILLE")) {
			vitesseMax = 50;
		} else if (this.type.equals("ROUTE")) {
			vitesseMax = 80;
		} else if (this.type.equals("AUTOROUTE")) {
			vitesseMax = 130;
		}
	}

	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}
}
