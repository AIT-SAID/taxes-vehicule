/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.service;

import com.Texes.taxesapiv1.bean.Vehicule;
import java.util.List;

/**
 *
 * @author saida
 */
public interface VehiculeService {
    //public List<Vehicule> findByRedevableCin(String reference);
    public int creerVehicule(Vehicule vehicule);
    public Vehicule FindByReference(String reference);
    
}
