/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author saida
 */
@Entity
public class TauxTaxeVehicule implements Serializable {

    @OneToOne(mappedBy = "tauxTaxeVehicule")
    private TaxeVehiculeMensuelle taxeVehiculeMensuelle;
    @OneToOne(mappedBy = "tauxTaxeVehicule")
    private TaxeVehiculeAnnuelle taxeVehiculeAnnuelle;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double pourcentage;
    private String reference;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateDebut;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateFin;
    private double penalite;
    private double majoration;
    
    @ManyToOne
    private TypeVehicule typeVehicule;

    public double getPenalite() {
        return penalite;
    }

    public void setPenalite(long penalite) {
        this.penalite = penalite;
    }

    public double getMajoration() {
        return majoration;
    }

    public void setMajoration(long majoration) {
        this.majoration = majoration;
    }

    
    public TaxeVehiculeAnnuelle getTaxeVehiculeAnnuelle() {
        return taxeVehiculeAnnuelle;
    }

    public void setTaxeVehiculeAnnuelle(TaxeVehiculeAnnuelle taxeVehiculeAnnuelle) {
        this.taxeVehiculeAnnuelle = taxeVehiculeAnnuelle;
    }

    
    public TaxeVehiculeMensuelle getTaxeVehiculeMensuelle() {
        return taxeVehiculeMensuelle;
    }

    public void setTaxeVehiculeMensuelle(TaxeVehiculeMensuelle taxeVehiculeMensuelle) {
        this.taxeVehiculeMensuelle = taxeVehiculeMensuelle;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    
    
    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public TypeVehicule getTypeVehicule() {
        return typeVehicule;
    }

    public void setTypeVehicule(TypeVehicule typeVehicule) {
        this.typeVehicule = typeVehicule;
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
        if (!(object instanceof TauxTaxeVehicule)) {
            return false;
        }
        TauxTaxeVehicule other = (TauxTaxeVehicule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Texes.taxesapiv1.bean.TauxTaxeVehicule[ id=" + id + " ]";
    }

}
