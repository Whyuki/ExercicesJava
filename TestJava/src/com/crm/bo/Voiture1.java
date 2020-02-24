package com.crm.bo;

import com.crm.bo.Route;

/**
 * Classe voiture avec attribut de type Route
 * @author Joanna
 * @version Voiture v2
 * Classe voiture avec attribut de type Route
 */
public class Voiture1 {

	private String marque;
	private String couleur;
	private int nbPortes;
	private String boiteVitesse;
	private float prix;
	private boolean marche;
	private int vitesse;
	private Route route;

	public Voiture1(String marque, String couleur, int nbPortes, String boiteVitesse, float prix) {
		this.marque = marque;
		this.couleur = couleur;
		this.nbPortes = nbPortes;
		this.boiteVitesse = boiteVitesse;
		this.prix = prix;

		route = new Route();
		route.setType("VILLE");
		route.setVitesseMax();
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getNbPortes() {
		return nbPortes;
	}

	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}

	public String getBoiteVitesse() {
		return boiteVitesse;
	}

	public void setBoiteVitesse(String boiteVitesse) {
		this.boiteVitesse = boiteVitesse;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public boolean isMarche() {
		return marche;
	}

	public void setMarche(boolean marche) {
		this.marche = marche;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public void afficherDetails() {
		System.out.println("Marque : " + marque);
		System.out.println("Couleur : " + couleur);
		System.out.println("Nombre de portes : " + nbPortes);
		System.out.println("Boite de vitesse : " + boiteVitesse);
		System.out.println("Prix : " + prix + "€");
	}

	public void demarrage() {
		marche = true;
		System.out.println("vroum-vroum !");
	}

	public void accelerer(int vitesseAcceleration, Route route) {
		if (marche == true) {
			if (vitesse + vitesseAcceleration <= route.getVitesseMax()) {
				vitesse = vitesse + vitesseAcceleration;
			} else {
				vitesse = route.getVitesseMax();
				this.avertissementVitesseMax();
			}

		} else {
			System.out.println("Demarrage nécessaire !");
		}

	}

	public void ralentir(int vitesseRalentissement) {
		if (vitesse - vitesseRalentissement >= 0) {
			vitesse = vitesse - vitesseRalentissement;
			this.afficherVitesse();
		} else {
			vitesse = 0;
		}
	}

	public void arret() {
		marche = false;
		vitesse = 0;
	}

	public void klaxonner() {
		System.out.println("Tu-tu-tuuuuuuut");
	}

	public void afficherVitesse() {
		System.out.println("Votre vitesse actuelle est de " + vitesse + "km/h");
	}

	public void avertissementVitesseMax() {
		System.out.println(
				"Attention dépassement de la vitesse limitée :" + "\nAdaptation automatique de votre vitesse !");
	}

	public void controleVitesse(Route route) {
		if (vitesse > route.getVitesseMax()) {
			vitesse = route.getVitesseMax();
			this.avertissementVitesseMax();
		}
		afficherVitesse();
	}

}
