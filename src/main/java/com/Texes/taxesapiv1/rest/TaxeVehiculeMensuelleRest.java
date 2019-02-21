/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.rest;

import com.Texes.taxesapiv1.bean.TaxeVehiculeMensuelle;
import com.Texes.taxesapiv1.rest.converter.TaxeVehiculeMensuelleConverter;
import com.Texes.taxesapiv1.rest.vo.TaxeVehiculeMensuelleVo;
import com.Texes.taxesapiv1.service.TaxeVehiculeMensuelleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author saida
 */
@RestController
@RequestMapping("/taxes-vehicule/taxeMensuelles")
public class TaxeVehiculeMensuelleRest {
    
    @Autowired
    private TaxeVehiculeMensuelleService taxeVehiculeMensuelleService;

    @Autowired
    private TaxeVehiculeMensuelleConverter taxeVehiculeMensuelleConverter;
            
    @GetMapping("/reference/{reference}")
    public TaxeVehiculeMensuelle findByReference(@PathVariable String reference) {
        return taxeVehiculeMensuelleService.findByReference(reference);
    }

    @PostMapping("/")
    public int creerTaxeMensuelle(@RequestBody TaxeVehiculeMensuelleVo tauxVehiculeMensuelleVo) {
        TaxeVehiculeMensuelle taxeVehiculeMensuelle=taxeVehiculeMensuelleConverter.toItem(tauxVehiculeMensuelleVo);
        int t=taxeVehiculeMensuelleService.creerTaxeMensuelle(taxeVehiculeMensuelle);
        return t;
    }

    @GetMapping("/mois/{mois}/annee/{annee}")
    public TaxeVehiculeMensuelle findByMoisAndAnnee(int mois, int annee) {
        return taxeVehiculeMensuelleService.findByMoisAndAnnee(mois, annee);
    }

    
    public TaxeVehiculeMensuelleService getTaxeVehiculeMensuelleService() {
        return taxeVehiculeMensuelleService;
    }

    public void setTaxeVehiculeMensuelleService(TaxeVehiculeMensuelleService taxeVehiculeMensuelleService) {
        this.taxeVehiculeMensuelleService = taxeVehiculeMensuelleService;
    }

    public TaxeVehiculeMensuelleConverter getTaxeVehiculeMensuelleConverter() {
        return taxeVehiculeMensuelleConverter;
    }

    public void setTaxeVehiculeMensuelleConverter(TaxeVehiculeMensuelleConverter taxeVehiculeMensuelleConverter) {
        this.taxeVehiculeMensuelleConverter = taxeVehiculeMensuelleConverter;
    }
    
    
}
