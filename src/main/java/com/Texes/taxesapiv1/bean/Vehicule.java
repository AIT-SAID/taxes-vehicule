/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author saida
 */
@Entity
public class Vehicule implements Serializable {

    @OneToOne(mappedBy = "vehicule")
    private TaxeVehiculeAnnuelle taxeVehiculeAnnuelle;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    @ManyToOne
    private TypeVehicule typeVehicule;
    private String cinRedevable;
    private String dernierMoisPaiement;
    private double dernierMontantPaye;
    private double dernierAnneePaiement;

    public String getCinRedevable() {
        return cinRedevable;
    }

    public void setCinRedevable(String cinRedevable) {
        this.cinRedevable = cinRedevable;
    }

   
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public TypeVehicule getTypeVehicule() {
        return typeVehicule;
    }

    public void setTypeVehicule(TypeVehicule typeVehicule) {
        this.typeVehicule = typeVehicule;
    }

    public String getDernierMoisPaiement() {
        return dernierMoisPaiement;
    }

    public void setDernierMoisPaiement(String dernierMoisPaiement) {
        this.dernierMoisPaiement = dernierMoisPaiement;
    }

   public double getDernierMontantPaye() {
        return dernierMontantPaye;
    }

    public void setDernierMontantPaye(double dernierMontantPaye) {
        this.dernierMontantPaye = dernierMontantPaye;
    }

    public double getDernierAnneePaiement() {
        return dernierAnneePaiement;
    }

    public void setDernierAnneePaiement(double dernierAnneePaiement) {
        this.dernierAnneePaiement = dernierAnneePaiement;
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
        if (!(object instanceof Vehicule)) {
            return false;
        }
        Vehicule other = (Vehicule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Texes.taxesapiv1.bean.vehicule[ id=" + id + " ]";
    }
    
}
