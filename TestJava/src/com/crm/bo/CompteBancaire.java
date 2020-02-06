/**
 * Classe metier CompteBancaire
 */
package com.crm.bo;

/**
 * @author Joanna
 *
 */
public class CompteBancaire {

	private String numeroCompte;
	private float solde;
	private final int DECOUVERT_AUTORISE = 150;
	private static int compteurClient = 0; // attribut/variable statique : appartient à la classe et non à l'objet!

	/**
	 * constructeur avec generation et assignation numeroCompte en f° du compteur de
	 * client qui s'incremente à chaque instance d'objet
	 */
	public CompteBancaire() {
		compteurClient++;
		this.numeroCompte = String.format("%010d", compteurClient);
		this.solde = 0;
	}

	/**
	 * constructeur parametre numero client, assignation du numero client par param
	 * 
	 * @param numeroCompte
	 */
	public CompteBancaire(String numeroCompte) {
		this.numeroCompte = numeroCompte;
		this.solde = 0;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	/**
	 * methode avec parametre qui debite le solde du montant entré en parametre dans
	 * la limite du découvert autorisé
	 * 
	 * @param montant
	 */
	public void retrait(int montant) {
		if ((solde - montant) >= -150) {
			solde = solde - montant;
			System.out.println("Retrait effectué, nouveau solde : " + solde);
		} else {
			System.out.println("Retrait impossible, depassement du découvert autorisé !" + "\nSolde : " + solde);
		}
	}

	/**
	 * methode avec parametre qui credite le solde du montant entré en parametre
	 */
	public void depot(int montant) {
		solde = solde + montant;
		System.out.println("Depot effectué, nouveau solde : " + solde);
	}

	public void afficherDetails() {
		System.out.println("\nNumero de compte : " + numeroCompte);
		System.out.println("Solde : " + solde);
		System.out.println("Decouvert autorisé : " + DECOUVERT_AUTORISE);
	}

}
