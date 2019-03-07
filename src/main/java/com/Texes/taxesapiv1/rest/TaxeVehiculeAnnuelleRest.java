/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.rest;

import com.Texes.taxesapiv1.bean.TaxeVehiculeAnnuelle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Texes.taxesapiv1.service.TaxeVehiculeAnnuelleService;

/**
 *
 * @author saida
 */
@RestController
@RequestMapping("/taxes_vehicule/taxeAnnuelles")
public class TaxeVehiculeAnnuelleRest {
    
    @Autowired
    private TaxeVehiculeAnnuelleService taxeVehiculeAnnuelleService;

     @GetMapping("/reference/{reference}")
    public TaxeVehiculeAnnuelle findByVehiculeReferenceAndAnnee(String reference, int annee) {
        return taxeVehiculeAnnuelleService.findByVehiculeReferenceAndAnnee(reference, annee);
    }
    @PostMapping("/")
    public int creerTaxe(TaxeVehiculeAnnuelle taxeVehiculeAnnuelle) {
        return taxeVehiculeAnnuelleService.creerTaxe(taxeVehiculeAnnuelle);
    }

    public void setTauxVehiculeAnnuelleService(TaxeVehiculeAnnuelleService taxeVehiculeAnnuelleService) {
        this.taxeVehiculeAnnuelleService = taxeVehiculeAnnuelleService;
    }
    public TaxeVehiculeAnnuelleService getTaxeVehiculeAnnuelleService() {
        return taxeVehiculeAnnuelleService;    }
    
    
    
}
