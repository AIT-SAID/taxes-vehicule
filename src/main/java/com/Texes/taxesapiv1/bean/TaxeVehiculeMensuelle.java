/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author saida
 */
@Entity
public class TaxeVehiculeMensuelle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date datePresentation;
    private double chiffreAffaire;
    private double montantBase;
    private double montantPenalite;
    private double montantMajoration;
    private double montantTaxe;
    private long nomberMoisRetard;
    
    
    @OneToOne
    private TauxTaxeVehicule tauxTaxeVehicule;
    private int mois;
    private int annee;

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    
    
    public Date getDatePresentation() {
        return datePresentation;
    }

    
    public void setDatePresentation(Date datePresentation) {
        this.datePresentation = datePresentation;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(double montantBase) {
        this.montantBase = montantBase;
    }

    public double getMontantPenalite() {
        return montantPenalite;
    }

    public void setMontantPenalite(double montantPenalite) {
        this.montantPenalite = montantPenalite;
    }

    public double getMontantMajoration() {
        return montantMajoration;
    }

    public void setMontantMajoration(double montantMajoration) {
        this.montantMajoration = montantMajoration;
    }

    public double getMontantTaxe() {
        return montantTaxe;
    }

    public void setMontantTaxe(double montantTaxe) {
        this.montantTaxe = montantTaxe;
    }

    public long getNomberMoisRetard() {
        return nomberMoisRetard;
    }

    public void setNomberMoisRetard(long nomberMoisRetard) {
        this.nomberMoisRetard = nomberMoisRetard;
    }

    public TauxTaxeVehicule getTauxTaxeVehicule() {
        return tauxTaxeVehicule;
    }

    public void setTauxTaxeVehicule(TauxTaxeVehicule tauxTaxeVehicule) {
        this.tauxTaxeVehicule = tauxTaxeVehicule;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxeVehiculeMensuelle)) {
            return false;
        }
        TaxeVehiculeMensuelle other = (TaxeVehiculeMensuelle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Texes.taxesapiv1.bean.TaxeVehiculeTrimestrielle[ id=" + id + " ]";
    }
    
}
