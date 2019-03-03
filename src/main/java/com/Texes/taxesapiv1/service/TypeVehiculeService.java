/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.service;

import com.Texes.taxesapiv1.bean.TypeVehicule;
import java.util.List;

/**
 *
 * @author saida
 */
public interface TypeVehiculeService {
    public int creerTypeVehicule(TypeVehicule typeVehicule);
    public TypeVehicule findByReference(String reference);
    public List<TypeVehicule> findAll();
    
    
}
