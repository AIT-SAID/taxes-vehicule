/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.rest;

import com.Texes.taxesapiv1.bean.TypeVehicule;
import com.Texes.taxesapiv1.bean.Vehicule;
import com.Texes.taxesapiv1.rest.converter.AbstractConverter;
import com.Texes.taxesapiv1.rest.vo.VehiculeVo;
import com.Texes.taxesapiv1.service.TypeVehiculeService;
import com.Texes.taxesapiv1.service.VehiculeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
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

@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/taxes_vehicule/typeVehicules")
public class TypeVehiculeRest {
    
    @Autowired
    private TypeVehiculeService typeVehiculeService;
    
    @Autowired
    private VehiculeService vehiculeService;

    @PostMapping("/")
    public int creerTypeVehicule(@RequestBody TypeVehicule typeVehicule) {
        return typeVehiculeService.creerTypeVehicule(typeVehicule);
    }

    @GetMapping("/reference/{reference}")
    public TypeVehicule findByReference(@PathVariable String reference) {
        return typeVehiculeService.findByReference(reference);
    }

    @GetMapping("/reference/{reference}/taxes-api-vehicule")
    public List<TypeVehicule> findAll() {
        return typeVehiculeService.findAll();
    }
    @Autowired
    @Qualifier("vehiculeConverter")
    private AbstractConverter<Vehicule,VehiculeVo> vehiculeConverter;

    @GetMapping("/")
    public List<VehiculeVo> findByTypeVehiculeReference(@PathVariable("reference") String reference) {
         final List<Vehicule> vehicules= vehiculeService.findByTypeVehiculeReference(reference);
         return vehiculeConverter.toVo(vehicules);
    }
    
    public TypeVehiculeService getTypeVehiculeService() {
        return typeVehiculeService;
    }

    public void setTypeVehiculeService(TypeVehiculeService typeVehiculeService) {
        this.typeVehiculeService = typeVehiculeService;
    }

    public VehiculeService getVehiculeService() {
        return vehiculeService;
    }

    public void setVehiculeService(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    public AbstractConverter<Vehicule, VehiculeVo> getVehiculeConverter() {
        return vehiculeConverter;
    }

    public void setVehiculeConverter(AbstractConverter<Vehicule, VehiculeVo> vehiculeConverter) {
        this.vehiculeConverter = vehiculeConverter;
    }
    
    
    
    
}
