/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.rest;

import com.Texes.taxesapiv1.bean.Vehicule;
import com.Texes.taxesapiv1.service.VehiculeService;
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
@RequestMapping("/taxes-vehicule/vehicules")
public class vehiculeRest {
    
    @Autowired
    private VehiculeService vehiculeService;

    @PostMapping("/")
    public int creerVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.creerVehicule(vehicule);
    }

    @GetMapping("/reference/{reference}")
    public Vehicule FindByReference(@PathVariable String reference) {
        return vehiculeService.FindByReference(reference);
    }

//    @GetMapping("/cin/{cin}")
//    public List<Vehicule> findByRedevableCin(String reference) {
//        return vehiculeService.findByRedevableCin(reference);
//    }
    

    
    
    public VehiculeService getVehiculeService() {
        return vehiculeService;
    }

    public void setVehiculeService(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }
    
    
    
}
