package com.lvm.model;

import java.util.ArrayList;

public class CahierDesCharges{

	private int idCahierDesCharges;
	private String typeSite;
	private String tailleEntreprise;
	private String fonctionnalites;
	private String typeLicence;
	
	public int getIdCahierDesCharges() {
		return idCahierDesCharges;
	}
	public void setIdCahierDesCharges(int idCahierDesCharges) {
		this.idCahierDesCharges = idCahierDesCharges;
	}
	public String getTypeSite() {
		return typeSite;
	}
	public void setTypeSite(String typeSite) {
		this.typeSite = typeSite;
	}
	public String getTailleEntreprise() {
		return tailleEntreprise;
	}
	public void setTailleEntreprise(String tailleEntreprise) {
		this.tailleEntreprise = tailleEntreprise;
	}
	public String getFonctionnalites() {
		return fonctionnalites;
	}
	public void setFonctionnalites(String fonctionnalites) {
		this.fonctionnalites = fonctionnalites;
	}
	public String getTypeLicence() {
		return typeLicence;
	}
	public void setTypeLicence(String typeLicence) {
		this.typeLicence = typeLicence;
	}
	
	@Override
    /* Methode qui retourne une phrase 
     * qui contient les infos d’un utilisateur
     */
    public String toString() {
        return "Type de site : " + typeSite;
    }    
	
	
}
