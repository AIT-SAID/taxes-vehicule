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
public class TaxeVehiculeMensuelleVo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String reference;
    private String datePresentation;
    private String chiffreAffaire;
    private String montantBase;
    private String montantPenalite;
    private String montantMajoration;
    private String montantTaxe;
    private String nomberMoisRetard;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDatePresentation() {
        return datePresentation;
    }

    public void setDatePresentation(String datePresentation) {
        this.datePresentation = datePresentation;
    }

    public String getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(String chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public String getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(String montantBase) {
        this.montantBase = montantBase;
    }

    public String getMontantPenalite() {
        return montantPenalite;
    }

    public void setMontantPenalite(String montantPenalite) {
        this.montantPenalite = montantPenalite;
    }

    public String getMontantMajoration() {
        return montantMajoration;
    }

    public void setMontantMajoration(String montantMajoration) {
        this.montantMajoration = montantMajoration;
    }

    public String getMontantTaxe() {
        return montantTaxe;
    }

    public void setMontantTaxe(String montantTaxe) {
        this.montantTaxe = montantTaxe;
    }

    public String getNomberMoisRetard() {
        return nomberMoisRetard;
    }

    public void setNomberMoisRetard(String nomberMoisRetard) {
        this.nomberMoisRetard = nomberMoisRetard;
    }
    
    
    
}