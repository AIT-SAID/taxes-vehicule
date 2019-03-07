/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.rest.vo;

/**
 *
 * @author saida
 */
public class TaxeVehiculeAnnuelleVo {
    private String datePresentation;
    private String chiffreAffaire;
    private String montantBase;
    private String montantPenalite;
    private String montantMajoration;
    private String montantTaxe;
    private String nomberMoisRestant;

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

    public String getNomberMoisRestant() {
        return nomberMoisRestant;
    }

    public void setNomberMoisRestant(String nomberMoisRestant) {
        this.nomberMoisRestant = nomberMoisRestant;
    }
    
    
    
}
