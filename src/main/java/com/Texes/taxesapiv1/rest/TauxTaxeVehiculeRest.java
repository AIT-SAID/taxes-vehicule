///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.Texes.taxesapiv1.rest;
//
//
//import com.Texes.taxesapiv1.bean.TauxTaxeVehicule;
//import com.Texes.taxesapiv1.service.TauxTaxeVehiculeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// *
// * @author saida
// */
//@RestController
//@RequestMapping("/taxes_vehicule/tauxtaxeVehicules")
//public class TauxTaxeVehiculeRest {
//    
//    @Autowired
//    private TauxTaxeVehiculeService tauxTaxeVehiculeService;
//
//    @PostMapping("/")
//    public int creerTauxTaxeVehicule(@RequestBody TauxTaxeVehicule tauxTaxeVehicule) {
//        return tauxTaxeVehiculeService.creerTauxTaxeVehicule(tauxTaxeVehicule);
//    }
//
//    @GetMapping("/reference/{reference}")
//    public TauxTaxeVehicule findByReference(@PathVariable String reference) {
//        return tauxTaxeVehiculeService.findByReference(reference);
//    }
//
//    public TauxTaxeVehiculeService getTauxTaxeVehiculeService() {
//        return tauxTaxeVehiculeService;
//    }
//
//    public void setTauxTaxeVehiculeService(TauxTaxeVehiculeService tauxTaxeVehiculeService) {
//        this.tauxTaxeVehiculeService = tauxTaxeVehiculeService;
//    }
//    
//    
//    
//    
//    
//}
