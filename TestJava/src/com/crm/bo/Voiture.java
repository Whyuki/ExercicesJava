/**
 * class metier voiture
 */
package com.crm.bo;

/**
 * class metier voiture
 * @author Joanna
 *
 */
public class Voiture {

	private String marque;
	private String couleur;
	private int nbPortes;
	private String boiteVitesse;
	private float prix;
	private boolean marche;
	private int vitesse;
	private String typeRoute;
	private static final int VILLE_VIT_MAX = 50;
	private static final int ROUTE_VIT_MAX = 80;
	private static final int AUTOROUTE_VIT_MAX = 130;
	private static final String VILLE = "ville";
	private static final String ROUTE = "route";
	private static final String AUTOROUTE = "autoroute";

	public Voiture() {

	}

	public Voiture(String marque, String couleur, int nbPortes, String boiteVitesse, float prix) {
		this.marque = marque;
		this.couleur = couleur;
		this.nbPortes = nbPortes;
		this.boiteVitesse = boiteVitesse;
		this.prix = prix;
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

	public String getTypeRoute() {
		return typeRoute;
	}

	public void setTypeRoute(String typeRoute) {
		this.typeRoute = typeRoute;
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

	public void accelerer(int vitesseAcceleration, String typeRoute) {
		if (marche == true) {
			switch (typeRoute) {
			case VILLE:
				if (vitesse + vitesseAcceleration <= VILLE_VIT_MAX) {
					vitesse = vitesse + vitesseAcceleration;
				} else {
					vitesse = VILLE_VIT_MAX;
					this.avertissementVitesseMax();
				}
				break;
			case ROUTE:
				if (vitesse + vitesseAcceleration <= ROUTE_VIT_MAX) {
					vitesse = vitesse + vitesseAcceleration;
				} else {
					vitesse = ROUTE_VIT_MAX;
					this.avertissementVitesseMax();
				}
				break;
			case AUTOROUTE:
				if (vitesse + vitesseAcceleration <= AUTOROUTE_VIT_MAX) {
					vitesse = vitesse + vitesseAcceleration;
				} else {
					vitesse = AUTOROUTE_VIT_MAX;
					this.avertissementVitesseMax();
				}
				break;
			default:
				System.out.println("Type de route non reconnue");
				break;
			}
		} else {
			System.out.println("Demarrage nécessaire !");
		}

		// this.afficherVitesse();
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
		System.out.println("Attention vitesse limitée !" + "\nAdaptation automatique de votre vitesse !");
	}

	public void controleVitesse(String typeRoute) {
		switch (typeRoute) {
		case VILLE:
			if (vitesse > VILLE_VIT_MAX) {
				vitesse = 50;
				this.avertissementVitesseMax();
			}
			break;
		case ROUTE:
			if (vitesse > ROUTE_VIT_MAX) {
				vitesse = 80;
				this.avertissementVitesseMax();
			}
			break;
		case AUTOROUTE:
			if (vitesse > AUTOROUTE_VIT_MAX) {
				vitesse = 130;
				this.avertissementVitesseMax();
			}
			break;
		default:
			System.out.println("Type de route non reconnue");
			break;
		}
		afficherVitesse();
	}
}
