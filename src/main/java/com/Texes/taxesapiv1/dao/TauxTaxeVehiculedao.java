/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.dao;

import com.Texes.taxesapiv1.bean.TauxTaxeVehicule;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author saida
 */
public interface TauxTaxeVehiculedao extends JpaRepository<TauxTaxeVehicule, Long> {

    public TauxTaxeVehicule findByReference(String reference);

    public TauxTaxeVehicule findByTypeVehiculeReference(String reference);

}
