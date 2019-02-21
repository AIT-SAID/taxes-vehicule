/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.rest.converter;

import com.Texes.taxesapiv1.Common.util.DateUtil;
import com.Texes.taxesapiv1.Common.util.NumberUtil;
import com.Texes.taxesapiv1.bean.TaxeVehiculeMensuelle;
import com.Texes.taxesapiv1.rest.vo.TaxeVehiculeMensuelleVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author saida
 */
@Component
public class TaxeVehiculeMensuelleConverter extends AbstractConverter<TaxeVehiculeMensuelle,TaxeVehiculeMensuelleVo>{
    
    
    @Override
    public TaxeVehiculeMensuelle toItem(TaxeVehiculeMensuelleVo vo) {
          
        if (vo != null) {
            TaxeVehiculeMensuelle item = new TaxeVehiculeMensuelle();
             
             
            if (vo.getReference()!= null) {
                item.setReference(vo.getReference());
            }
           
            if (vo.getChiffreAffaire()!= null) {
                item.setChiffreAffaire(NumberUtil.toDouble(vo.getChiffreAffaire()));
            }
            if (vo.getMontantBase()!= null) {
                item.setMontantBase(NumberUtil.toDouble(vo.getMontantBase()));
            } 
            if (vo.getMontantMajoration()!= null) {
                item.setMontantMajoration(NumberUtil.toDouble(vo.getMontantMajoration()));
            }
            if (vo.getMontantPenalite()!= null) {
                item.setMontantPenalite(NumberUtil.toDouble(vo.getMontantPenalite()));
            }
            if (vo.getMontantTaxe()!= null) {
                item.setMontantTaxe(NumberUtil.toDouble(vo.getMontantTaxe()));
            }
            if (vo.getNomberMoisRetard()!= null) {
                item.setNomberMoisRetard(NumberUtil.toInt(vo.getNomberMoisRetard()));
            }
            if (vo.getDatePresentation()!= null) {
                item.setDatePresentation(DateUtil.parseYYYYMMDDmmhhSS(vo.getDatePresentation()));
            }
       
            return item;
        }
        return null;
    }

    @Override
    public TaxeVehiculeMensuelleVo toVo(TaxeVehiculeMensuelle item) {
          if (item != null) {
            TaxeVehiculeMensuelleVo vo = new TaxeVehiculeMensuelleVo();
             
             
            if (item.getReference()!= null) {
                vo.setReference(item.getReference());
            }
           
            if (item.getChiffreAffaire()!= 0) {
                vo.setChiffreAffaire(NumberUtil.toString(item.getChiffreAffaire()));
            }
            if (item.getMontantBase()!= 0) {
                vo.setMontantBase(NumberUtil.toString(item.getMontantBase()));
            } 
            if (item.getMontantMajoration()!= 0) {
                vo.setMontantMajoration(NumberUtil.toString(item.getMontantMajoration()));
            }
            if (item.getMontantPenalite()!= 0) {
                vo.setMontantPenalite(NumberUtil.toString(item.getMontantPenalite()));
            }
            if (item.getMontantTaxe()!= 0) {
                vo.setMontantTaxe(NumberUtil.toString(item.getMontantTaxe()));
            }
            if (item.getNomberMoisRetard()!= 0) {
                vo.setNomberMoisRetard(NumberUtil.toString(item.getNomberMoisRetard()));
            }
            if (item.getDatePresentation()!= null) {
                vo.setDatePresentation(DateUtil.formatYYYYMMDDmmhhSS(item.getDatePresentation()));
            }

            return vo;
        }
        return null;
    }
    
}
