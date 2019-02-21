/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.rest.converter;

import com.Texes.taxesapiv1.Common.util.NumberUtil;
import com.Texes.taxesapiv1.bean.Vehicule;
import com.Texes.taxesapiv1.rest.vo.VehiculeVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author saida
 */
@Component
public class VehiculeConverter extends AbstractConverter<Vehicule, VehiculeVo>{
    
    @Override
    public Vehicule toItem(VehiculeVo vo) {
          
        if (vo != null) {
            Vehicule item = new Vehicule();
             
             
            if (vo.getReference()!= null) {
                item.setReference(vo.getReference());
            }
           
            if (vo.getDernierMontantPaye()!= null) {
                item.setDernierMontantPaye(NumberUtil.toDouble(vo.getDernierMontantPaye()));
            }
            if (vo.getDernierAnneePaiement()!= null) {
                item.setDernierAnneePaiement(NumberUtil.toDouble(vo.getDernierAnneePaiement()));
            } 
            if (vo.getDernierMoisPaiement()!= null) {
                item.setDernierMoisPaiement(vo.getDernierMoisPaiement());
            }
            if(vo.getCinRedevable()!= null){
                item.setCinRedevable(vo.getCinRedevable());
            }      
            
            return item;
        }
        return null;
    }

    @Override
    public VehiculeVo toVo(Vehicule item) {
          if (item != null) {
            VehiculeVo vo = new VehiculeVo();
             
             
            if (item.getReference()!= null) {
                vo.setReference(item.getReference());
            }
           
            if (item.getDernierMontantPaye()!= 0) {
                vo.setDernierMontantPaye(NumberUtil.toString(item.getDernierMontantPaye()));
            }
            if (item.getDernierAnneePaiement()!= 0) {
                vo.setDernierAnneePaiement(NumberUtil.toString(item.getDernierAnneePaiement()));
            } 
            if (item.getDernierMoisPaiement()!= null) {
                vo.setDernierMoisPaiement(item.getDernierMoisPaiement());
            }
            if(item.getCinRedevable()!= null){
                vo.setCinRedevable(vo.getCinRedevable());
            }      
            
            return vo;
        }
        return null;
    }
    
}
