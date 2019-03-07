/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.service.impl;

import ch.qos.logback.core.pattern.ConverterUtil;
import com.Texes.taxesapiv1.bean.TauxTaxeVehicule;
import com.Texes.taxesapiv1.bean.TaxeVehiculeMensuelle;
import com.Texes.taxesapiv1.dao.TaxeVehiculeMensuelleDao;
import com.Texes.taxesapiv1.service.TauxTaxeVehiculeService;
import com.Texes.taxesapiv1.service.TaxeVehiculeMensuelleService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author saida
 */
@Service
public class TaxeVehiculeMensuelleImp implements TaxeVehiculeMensuelleService {

    @Autowired
    private TaxeVehiculeMensuelleService taxeVehiculeMensuelleService;

    @Autowired
    private TauxTaxeVehiculeService tauxTaxeVehiculeService;
    
    @Autowired
    private TaxeVehiculeMensuelleDao taxeVehiculeMensuelleDao;

    @Override
    public int creerTaxeMensuelle(TaxeVehiculeMensuelle taxeVehiculeMensuelle) {
        TaxeVehiculeMensuelle t = findByMoisAndAnnee(taxeVehiculeMensuelle.getMois(), taxeVehiculeMensuelle.getAnnee());
        if (t != null) {
            return -1;
        } else {
            long mois = 1000 * 60 * 60 * 24 * 30;           
            Date toDay = new Date();
            long val = taxeVehiculeMensuelle.getDatePresentation().getTime() - toDay.getTime();
            long nbMoisRetard = val / mois;
                taxeVehiculeMensuelle.setNomberMoisRetard(nbMoisRetard);
            long moisRetard = taxeVehiculeMensuelle.getNomberMoisRetard();
            

            TauxTaxeVehicule taux=tauxTaxeVehiculeService.findByTypeVehiculeReference(taxeVehiculeMensuelle.getTauxTaxeVehicule().getTypeVehicule().getReference());
            Double montantBase = taxeVehiculeMensuelle.getChiffreAffaire() * taux.getPourcentage() / 100;
            taxeVehiculeMensuelle.setMontantBase(montantBase);

            if (moisRetard == 0) {
                taxeVehiculeMensuelle.setMontantTaxe(montantBase);
                taxeVehiculeMensuelleDao.save(taxeVehiculeMensuelle);
                return 1;
            } else {

                taxeVehiculeMensuelle.setMontantMajoration(montantBase * 10 / 100);

                if (moisRetard == 1) {
                    taxeVehiculeMensuelle.setMontantTaxe(montantBase + taxeVehiculeMensuelle.getMontantMajoration());
                    taxeVehiculeMensuelleDao.save(taxeVehiculeMensuelle);
                    return 2;

                } else {
                    taxeVehiculeMensuelle.setMontantPenalite(montantBase * moisRetard * 5 / 100);
                    taxeVehiculeMensuelle.setMontantTaxe(montantBase + taxeVehiculeMensuelle.getMontantMajoration() + taxeVehiculeMensuelle.getMontantPenalite());
                    taxeVehiculeMensuelleDao.save(taxeVehiculeMensuelle);
                    return 3;
                }
            }
        }
    }
    @Override
   public TaxeVehiculeMensuelle findByMoisAndAnnee(int mois, int annee) {
       return taxeVehiculeMensuelleDao.findByMoisAndAnnee(mois, annee);
   }

   
    
//    @Override
//    public TaxeVehiculeMensuelle findByMoisAndAnnee(int mois, int annee) {
//        return taxeVehiculeMensuelleDao.findByMoisByAnnee(mois, annee);
//        
//    }

    public TaxeVehiculeMensuelleService getTaxeVehiculeMensuelleService() {
        return taxeVehiculeMensuelleService;
    }

    public void setTaxeVehiculeMensuelleService(TaxeVehiculeMensuelleService taxeVehiculeMensuelleService) {
        this.taxeVehiculeMensuelleService = taxeVehiculeMensuelleService;
    }

    public TaxeVehiculeMensuelleDao getTaxeVehiculeMensuelleDao() {
        return taxeVehiculeMensuelleDao;
    }

    public void setTaxeVehiculeMensuelleDao(TaxeVehiculeMensuelleDao taxeVehiculeMensuelleDao) {
        this.taxeVehiculeMensuelleDao = taxeVehiculeMensuelleDao;
    }

    

    

    

}
