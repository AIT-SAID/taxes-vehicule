/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.service;

import com.Texes.taxesapiv1.bean.TaxeVehiculeMensuelle;

/**
 *
 * @author saida
 */
public interface TaxeVehiculeMensuelleService {
    public int creerTauxMensuelle(TaxeVehiculeMensuelle tauxVehiculeTrimestrielle);
    public TaxeVehiculeMensuelle findByReference(String reference);
    
}
