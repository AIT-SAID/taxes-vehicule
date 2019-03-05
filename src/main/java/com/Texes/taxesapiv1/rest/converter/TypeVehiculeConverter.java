/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.rest.converter;

import com.Texes.taxesapiv1.bean.TypeVehicule;
import com.Texes.taxesapiv1.rest.vo.TypeVehiculeVo;

/**
 *
 * @author saida
 */
public class TypeVehiculeConverter extends AbstractConverter<TypeVehicule, TypeVehiculeVo>{

    @Override
    public TypeVehicule toItem(TypeVehiculeVo vo) {
        if (vo != null) {
            TypeVehicule item = new TypeVehicule();
             
             
            if (vo.getReference()!= null) {
                item.setReference(vo.getReference());
            }
            if (vo.getLibelle()!= null) {
                item.setLibelle(vo.getLibelle());
            }
            return item;
        }
        return null;
    }
    

    @Override
    public TypeVehiculeVo toVo(TypeVehicule item) {
        
        if (item != null) {
            TypeVehiculeVo vo = new TypeVehiculeVo();
             
             
            if (item.getReference()!= null) {
                vo.setReference(item.getReference());
            }
            if (item.getLibelle()!= null) {
                vo.setLibelle(item.getLibelle());
            }
            return vo;
    }
        return null;
    } 
}
