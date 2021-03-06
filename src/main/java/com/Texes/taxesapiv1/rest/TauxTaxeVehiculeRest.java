
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package com.Texes.taxesapiv1.rest;
//
//
import com.Texes.taxesapiv1.bean.TauxTaxeVehicule;
import com.Texes.taxesapiv1.rest.converter.TauxTaxeVehiculeConverter;
import com.Texes.taxesapiv1.rest.vo.TauxTaxeVehiculeVo;
import com.Texes.taxesapiv1.service.TauxTaxeVehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

///**
// *
// * @author saida
// */
@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/taxes_vehicule/tauxtaxeVehicules")
public class TauxTaxeVehiculeRest {
    
    @Autowired
    private TauxTaxeVehiculeService tauxTaxeVehiculeService;
    @Autowired
    private TauxTaxeVehiculeConverter tauxTaxeVehiculeConverter;

    @PostMapping("/")
    public int creerTauxTaxeVehicule(@RequestBody TauxTaxeVehiculeVo tauxTaxeVehiculeVo) {
        TauxTaxeVehicule tauxTaxeVehicule=tauxTaxeVehiculeConverter.toItem(tauxTaxeVehiculeVo);
    int   taux=tauxTaxeVehiculeService.creerTauxTaxeVehicule(tauxTaxeVehicule);
    return taux;
   }

    @GetMapping("/reference/{reference}")
   public TauxTaxeVehicule findByReference(@PathVariable String reference) {
       return tauxTaxeVehiculeService.findByReference(reference);
   }

   @GetMapping("/TypeVehicule/reference/{reference}")
    public TauxTaxeVehicule findByTypeVehiculeReference(@PathVariable String reference) {
        return tauxTaxeVehiculeService.findByTypeVehiculeReference(reference);
    }

   
    public TauxTaxeVehiculeService getTauxTaxeVehiculeService() {
       return tauxTaxeVehiculeService;
    }

    public void setTauxTaxeVehiculeService(TauxTaxeVehiculeService tauxTaxeVehiculeService) {
        this.tauxTaxeVehiculeService = tauxTaxeVehiculeService;
    }

    public TauxTaxeVehiculeConverter getTauxTaxeVehiculeConverter() {
        return tauxTaxeVehiculeConverter;
    }

    public void setTauxTaxeVehiculeConverter(TauxTaxeVehiculeConverter tauxTaxeVehiculeConverter) {
        this.tauxTaxeVehiculeConverter = tauxTaxeVehiculeConverter;
    }
   
    
}
