/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author saida
 */
@Entity
public class TypeVehicule implements Serializable {

    
   
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private String libelle;
    @OneToMany(mappedBy = "typeVehicule")
    private List<Vehicule> vehicules;

     @OneToMany(mappedBy = "typeVehicule")
    private List<TauxTaxeVehicule> tauxTaxeVehicules;

    public List<TauxTaxeVehicule> getTauxTaxeVehicules() {
        return tauxTaxeVehicules;
    }

    public void setTauxTaxeVehicules(List<TauxTaxeVehicule> tauxTaxeVehicules) {
        this.tauxTaxeVehicules = tauxTaxeVehicules;
    }

    @JsonIgnore
    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    @JsonSetter
    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }


    
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
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
        if (!(object instanceof TypeVehicule)) {
            return false;
        }
        TypeVehicule other = (TypeVehicule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Texes.taxesapiv1.bean.TypeVehicule[ id=" + id + " ]";
    }
    
}
