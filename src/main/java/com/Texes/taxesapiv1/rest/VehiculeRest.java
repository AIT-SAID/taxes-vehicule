/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.rest;

import com.Texes.taxesapiv1.bean.Vehicule;
import com.Texes.taxesapiv1.service.VehiculeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author saida
 */
@RestController
@RequestMapping("/taxe-vehicule/vehicules")
public class VehiculeRest {
    
    @Autowired
    private VehiculeService vehiculeService;

    @GetMapping("")
    public List<Vehicule> findByTypeVehiculeReference(String reference) {
        return vehiculeService.findByTypeVehiculeReference(reference);
    }

    @PostMapping("/")
    public int creerVehicule(Vehicule vehicule) {
        return vehiculeService.creerVehicule(vehicule);
    }

    @GetMapping("/reference/{reference}")
    public Vehicule FindByReference(String reference) {
        return vehiculeService.FindByReference(reference);
    }

    public VehiculeService getVehiculeService() {
        return vehiculeService;
    }

    public void setVehiculeService(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }
    
    
    
    
    
}