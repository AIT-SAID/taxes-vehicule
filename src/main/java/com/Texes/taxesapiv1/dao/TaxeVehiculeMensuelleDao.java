/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.dao;

import com.Texes.taxesapiv1.bean.TaxeVehiculeMensuelle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author saida
 */
@Repository
public interface TaxeVehiculeMensuelleDao extends JpaRepository<TaxeVehiculeMensuelle, Long>{
    
    public TaxeVehiculeMensuelle findByReference(String reference);
    public TaxeVehiculeMensuelle findByMoisAndAnnee(int mois,int annee);
    
}
