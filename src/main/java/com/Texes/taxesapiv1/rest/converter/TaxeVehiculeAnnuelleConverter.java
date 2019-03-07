/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.rest.converter;

import com.Texes.taxesapiv1.Common.util.DateUtil;
import com.Texes.taxesapiv1.Common.util.NumberUtil;
import com.Texes.taxesapiv1.bean.TaxeVehiculeAnnuelle;
import com.Texes.taxesapiv1.rest.vo.TauxTaxeVehiculeVo;
import com.Texes.taxesapiv1.rest.vo.TaxeVehiculeAnnuelleVo;

/**
 *
 * @author saida
 */
public class TaxeVehiculeAnnuelleConverter extends AbstractConverter<TaxeVehiculeAnnuelle, TaxeVehiculeAnnuelleVo>{

    @Override
    public TaxeVehiculeAnnuelle toItem(TaxeVehiculeAnnuelleVo vo) {
        if (vo != null) {
            TaxeVehiculeAnnuelle item = new TaxeVehiculeAnnuelle();
            
           
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
            if (vo.getNomberMoisRestant()!= null) {
                item.setNomberMoisRestant(NumberUtil.toInt(vo.getNomberMoisRestant()));
            }
            if (vo.getDatePresentation()!= null) {
                item.setDatePresentation(DateUtil.parse(vo.getDatePresentation(),DateUtil.paternYYYY_MM_DD));
            }
       
            return item;
        }
        return null;
    }

    @Override
    public TaxeVehiculeAnnuelleVo toVo(TaxeVehiculeAnnuelle item) {
        if (item != null) {
            TaxeVehiculeAnnuelleVo vo = new TaxeVehiculeAnnuelleVo();
             

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
            if (item.getNomberMoisRestant()!= 0) {
                vo.setNomberMoisRestant(NumberUtil.toString(item.getNomberMoisRestant()));
            }
            if (item.getDatePresentation()!= null) {
                vo.setDatePresentation(DateUtil.formatYYYYMMDDmmhhSS(item.getDatePresentation()));
            }

            return vo;
        }
        return null;
    }
    }
    

