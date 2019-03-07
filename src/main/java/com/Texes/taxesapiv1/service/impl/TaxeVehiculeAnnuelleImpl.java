/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.service.impl;

import com.Texes.taxesapiv1.Common.util.DateUtil;
import com.Texes.taxesapiv1.bean.TauxTaxeVehicule;
import com.Texes.taxesapiv1.bean.TaxeVehiculeAnnuelle;
import com.Texes.taxesapiv1.bean.Vehicule;
import com.Texes.taxesapiv1.dao.TaxeVehiculeAnnuelleDao;
import com.Texes.taxesapiv1.service.TauxTaxeVehiculeService;
import com.Texes.taxesapiv1.service.TaxeVehiculeAnnuelleService;
import com.Texes.taxesapiv1.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author saida
 */
@Service
public class TaxeVehiculeAnnuelleImpl implements TaxeVehiculeAnnuelleService{
    
    @Autowired
    private TaxeVehiculeAnnuelleService taxeVehiculeAnnuelleService;
    
    @Autowired
    private VehiculeService vehiculeService;
    
    @Autowired
    private TaxeVehiculeAnnuelleDao taxeVehiculeAnnuelleDao;
    
    @Autowired
    private TauxTaxeVehiculeService tauxTaxeVehiculeService;
    
    @Override
    public int creerTaxe(TaxeVehiculeAnnuelle taxeVehiculeAnnuelle) {
        String vehiculeReference = taxeVehiculeAnnuelle.getVehicule().getReference();
        TaxeVehiculeAnnuelle taxe = findByVehiculeReferenceAndAnnee(vehiculeReference, taxeVehiculeAnnuelle.getAnnee());
        System.out.println("terrain.getReference() == " + vehiculeReference);
        Vehicule vehicule = vehiculeService.findByReference(vehiculeReference);
        //hada l'erreur ta3 before flushing
        taxeVehiculeAnnuelle.setVehicule(vehicule);
        TauxTaxeVehicule tauxTaxeVehicule = tauxTaxeVehiculeService.findByTypeVehiculeReference(vehicule.getTypeVehicule().getReference());
        System.out.println("tauxTaxeTnb = " + tauxTaxeVehicule);
        int res = 0;
        if (vehicule == null) {
            return -11;
        } else if (taxe != null) {
            return -22;
        } else if (tauxTaxeVehicule == null) {
            return -33;
        } else {
            int nombreMoisRetard = (int) DateUtil.diff(taxeVehiculeAnnuelle.getDatePresentation(), (int) taxeVehiculeAnnuelle.getAnnee());
            System.out.println("le nombre de retard est" + nombreMoisRetard);
            double montant = 0;
            double nvMontantDeBase = taxeVehiculeAnnuelle.getChiffreAffaire() * tauxTaxeVehicule.getPourcentage() / 100;
            double nvMontantMajoration = nvMontantDeBase * tauxTaxeVehicule.getMajoration();
            double nvMontantPenalite = nvMontantDeBase * tauxTaxeVehicule.getPenalite();
            System.out.println("montantPenalite = " + nvMontantPenalite);
            System.out.println("montantMajoration = " + nvMontantMajoration);
            System.out.println("montantDeBase = " + nvMontantDeBase);

            if (nombreMoisRetard == 0) {
                montant += nvMontantDeBase;
                res = 1;
            } else if (nombreMoisRetard == 1) {
                montant += nvMontantDeBase + nvMontantMajoration;
                taxeVehiculeAnnuelle.setMontantMajoration(nvMontantMajoration);
                res = 2;
            } else if (nombreMoisRetard > 1) {
                montant += nvMontantDeBase + nvMontantMajoration + nvMontantPenalite*nombreMoisRetard;
                taxeVehiculeAnnuelle.setMontantMajoration(nvMontantMajoration);
                taxeVehiculeAnnuelle.setMontantPenalite(nvMontantPenalite);
                res = 3;
            }
            taxeVehiculeAnnuelle.setMontantTaxe(montant);
            taxeVehiculeAnnuelle.setNomberMoisRestant(nombreMoisRetard);
            taxeVehiculeAnnuelle.setMontantBase(nvMontantDeBase);
            taxeVehiculeAnnuelleDao.save(taxeVehiculeAnnuelle);
            return nombreMoisRetard;
        }
    }
    @Override
    public TaxeVehiculeAnnuelle findByVehiculeReferenceAndAnnee(String reference, int annee) {
        return taxeVehiculeAnnuelleDao.findByVehiculeReferenceAndAnnee(reference, annee);
    }
    
}
