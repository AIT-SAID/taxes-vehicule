/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.rest;

import com.Texes.taxesapiv1.bean.TypeVehicule;
import com.Texes.taxesapiv1.bean.Vehicule;
import com.Texes.taxesapiv1.rest.converter.AbstractConverter;
import com.Texes.taxesapiv1.rest.converter.VehiculeConverter;
import com.Texes.taxesapiv1.rest.proxy.RedevableProxy;
import com.Texes.taxesapiv1.rest.vo.RedevableVo;
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
@RequestMapping("/taxes-vehicule/vehicules")
public class VehiculeRest {
    
    @Autowired
    private VehiculeService vehiculeService;
    
    @Autowired
    private RedevableProxy redevableProxy;
    

    
    private AbstractConverter<Vehicule,VehiculeVo> vehiculeConverter= new VehiculeConverter();
   
    @PostMapping("/")
    public int creerVehicule(@RequestBody VehiculeVo vehiculeVo) {
        Vehicule vehicule=vehiculeConverter.toItem(vehiculeVo);
    int v=vehiculeService.creerVehicule(vehicule);
    return v;
    }
  
    @GetMapping("/cin/{cin}")
    public RedevableVo findRedevableByCin(@PathVariable String cin) {
        return redevableProxy.findByCin(cin);
    }
    @GetMapping("/reference/{reference}")
    public Vehicule FindByReference(@PathVariable String reference) {
        return vehiculeService.FindByReference(reference);
    }

    @GetMapping("/")
    public List<VehiculeVo> findByTypeVehiculeReference(String reference) {
        return vehiculeConverter.toVo(vehiculeService.findByTypeVehiculeReference(reference));
    }

    public RedevableProxy getRedevableProxy() {
        return redevableProxy;
    }

    public void setRedevableProxy(RedevableProxy redevableProxy) {
        this.redevableProxy = redevableProxy;
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
    
    
    
    

