/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.rest.vo;

import java.io.Serializable;

/**
 *
 * @author saida
 */
public class VehiculeVo implements Serializable{
    
        private static final long serialVersionUID = 1L;

    private String reference;
    private String cinRedevable;
    private String dernierMoisPaiement;
    private String dernierMontantPaye;
    private String dernierAnneePaiement;

    
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCinRedevable() {
        return cinRedevable;
    }

    public void setCinRedevable(String cinRedevable) {
        this.cinRedevable = cinRedevable;
    }

    public String getDernierMoisPaiement() {
        return dernierMoisPaiement;
    }

    public void setDernierMoisPaiement(String dernierMoisPaiement) {
        this.dernierMoisPaiement = dernierMoisPaiement;
    }

    public String getDernierMontantPaye() {
        return dernierMontantPaye;
    }

    public void setDernierMontantPaye(String dernierMontantPaye) {
        this.dernierMontantPaye = dernierMontantPaye;
    }

    public String getDernierAnneePaiement() {
        return dernierAnneePaiement;
    }

    public void setDernierAnneePaiement(String dernierAnneePaiement) {
        this.dernierAnneePaiement = dernierAnneePaiement;
    }
    
    
    
    
    
}
