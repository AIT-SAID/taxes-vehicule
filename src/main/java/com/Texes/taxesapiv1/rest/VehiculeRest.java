/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.rest;

import com.Texes.taxesapiv1.bean.TypeVehicule;
import com.Texes.taxesapiv1.bean.Vehicule;
import com.Texes.taxesapiv1.rest.converter.VehiculeConverter;
import com.Texes.taxesapiv1.rest.vo.VehiculeVo;
import com.Texes.taxesapiv1.service.VehiculeService;
import java.util.List;
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
@RequestMapping("/taxe-vehicule/vehicules")
public class VehiculeRest {
    
    @Autowired
    private VehiculeService vehiculeService;
    @Autowired
    private VehiculeConverter vehiculeConverter;

    @GetMapping("")
    public List<Vehicule> findByTypeVehiculeReference(@PathVariable String reference) {
        return vehiculeService.findByTypeVehiculeReference(reference);
    }

    @PostMapping("/")
    public int creerVehicule(@RequestBody VehiculeVo vehiculeVo) {
         Vehicule vehicule=vehiculeConverter.toItem(vehiculeVo);
    int   vehic=vehiculeService.creerVehicule(vehicule);
    return vehic;
    }

    @GetMapping("/reference/{reference}")
    public Vehicule FindByReference(@PathVariable String reference) {
        return vehiculeService.FindByReference(reference);
    }

    public VehiculeService getVehiculeService() {
        return vehiculeService;
    }

    public void setVehiculeService(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    public VehiculeConverter getVehiculeConverter() {
        return vehiculeConverter;
    }

    public void setVehiculeConverter(VehiculeConverter vehiculeConverter) {
        this.vehiculeConverter = vehiculeConverter;
    }
    
}