/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.service.impl;

import com.Texes.taxesapiv1.bean.TaxeVehiculeMensuelle;
import com.Texes.taxesapiv1.dao.TaxeVehiculeMensuelleDao;
import com.Texes.taxesapiv1.service.TaxeVehiculeMensuelleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author saida
 */
@Service 
public class TaxeVehiculeMensuelleImp implements TaxeVehiculeMensuelleService{
    
    @Autowired
    private TaxeVehiculeMensuelleService taxeVehiculeMensuelleService;

    @Autowired
    private TaxeVehiculeMensuelleDao taxeVehiculeMensuelleDao;
    
    @Override
    public int creerTauxMensuelle(TaxeVehiculeMensuelle tauxVehiculeTrimestrielle) {
        
    }

    @Override
    public TaxeVehiculeMensuelle findByReference(String reference) {
        return taxeVehiculeMensuelleDao.findByReference(reference);
    }

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
