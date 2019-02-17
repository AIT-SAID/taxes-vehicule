/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.service.impl;

import com.Texes.taxesapiv1.dao.TaxeVehiculeAnnuelleDao;
import com.Texes.taxesapiv1.service.TaxeVehiculeAnnuelleService;
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
    private TaxeVehiculeAnnuelleDao taxeVehiculeAnnuelleDao;
    
    
    
    
}
