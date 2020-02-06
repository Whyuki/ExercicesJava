/**
 * 
 */
package com.crm.bo;

/**
 * @author Joanna
 *
 */
public class CompteBancaire {

	private String numeroCompte;
	protected float solde;
	protected final int decouvertAutorise = 150;
	
	
	//constructeur parametre numClient et generation et assignation numero client en f° du param
	public CompteBancaire(int numClient) {
		this.numeroCompte = String.format("%010d", numClient);
		this.solde = 0;
	}
	//constructeur parametre numero client, assignation du numero client par param
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
//	public static String generateurNumCompte(int numClient) {
//		return String.format("%010d", numClient);
//	}
	
	public void retrait(int montant) {
		if ((solde - montant) >= -150) {
			solde = solde - montant;
			System.out.println("Retrait effectué, nouveau solde : " + solde);
		} else {
			System.out.println("Retrait impossible, depassement du découvert autorisé !"+"\nSolde : "+solde);
		}
	}

	public void depot(int montant) {
		solde = solde + montant;
		System.out.println("Depot effectué, nouveau solde : " + solde);
	}

	public void afficherDetails() {
		System.out.println("Numero de compte : " + numeroCompte);
		System.out.println("Solde : " + solde);
		System.out.println("Decouvert autorisé : " + decouvertAutorise);
	}

	
}
