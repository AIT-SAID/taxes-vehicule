/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.service;

import com.Texes.taxesapiv1.bean.TauxTaxeVehicule;

/**
 *
 * @author saida
 */

public interface TauxTaxeVehiculeService {
    
    public int creerTauxTaxeVehicule(TauxTaxeVehicule tauxTaxeVehicule);
    public TauxTaxeVehicule findByReference(String reference);
    public TauxTaxeVehicule findByTypeVehiculeReference(String reference);
    
}
