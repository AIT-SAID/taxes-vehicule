/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.rest;

import com.Texes.taxesapiv1.bean.TypeVehicule;
import com.Texes.taxesapiv1.service.TypeVehiculeService;
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
@RequestMapping("/taxes_vehicule/typeVehicules")
public class TypeVehiculeRest {
    
    @Autowired
    private TypeVehiculeService typeVehiculeService;

    @PostMapping("/")
    public int creerTypeVehicule(@RequestBody TypeVehicule typeVehicule) {
        return typeVehiculeService.creerTypeVehicule(typeVehicule);
    }

    @GetMapping("/reference/{reference}")
    public TypeVehicule findByReference(@PathVariable String reference) {
        return typeVehiculeService.findByReference(reference);
    }

    
    public TypeVehiculeService getTypeVehiculeService() {
        return typeVehiculeService;
    }

    public void setTypeVehiculeService(TypeVehiculeService typeVehiculeService) {
        this.typeVehiculeService = typeVehiculeService;
    }
    
    
    
    
}
