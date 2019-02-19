/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.service.impl;

import com.Texes.taxesapiv1.bean.TauxTaxeVehicule;
import com.Texes.taxesapiv1.dao.TauxTaxeVehiculedao;
import com.Texes.taxesapiv1.service.TauxTaxeVehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author saida
 */
@Service
public class TauxTaxeVehiculeImpl implements TauxTaxeVehiculeService{

    @Autowired 
    private TauxTaxeVehiculedao tauxTaxeVehiculeDao;
    @Override
    public int creerTauxTaxeVehicule(TauxTaxeVehicule tauxTaxeVehicule) {
        TauxTaxeVehicule tauxtax=findByReference(tauxTaxeVehicule.getReference());
        if(tauxtax!=null){
            return -1;
        }else{
            tauxTaxeVehiculeDao.save(tauxtax);
            return 1;
        }
        
    }

    @Override
    public TauxTaxeVehicule findByReference(String reference) {
        return tauxTaxeVehiculeDao.findByReference(reference);
    }

    public TauxTaxeVehiculedao getTauxTaxeVehiculeDao() {
        return tauxTaxeVehiculeDao;
    }

    public void setTauxTaxeVehiculeDao(TauxTaxeVehiculedao tauxTaxeVehiculeDao) {
        this.tauxTaxeVehiculeDao = tauxTaxeVehiculeDao;
    }
    
    
}
