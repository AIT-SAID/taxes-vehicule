/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.rest.converter;

import com.Texes.taxesapiv1.Common.util.DateUtil;
import com.Texes.taxesapiv1.Common.util.NumberUtil;
import com.Texes.taxesapiv1.bean.TauxTaxeVehicule;
import com.Texes.taxesapiv1.rest.vo.TauxTaxeVehiculeVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author saida
 */
@Component
public class TauxTaxeVehiculeConverter extends AbstractConverter<TauxTaxeVehicule, TauxTaxeVehiculeVo> {

    @Override
    public TauxTaxeVehicule toItem(TauxTaxeVehiculeVo vo) {

        if (vo != null) {
            TauxTaxeVehicule item = new TauxTaxeVehicule();

            if (vo.getReference() != null) {
                item.setReference(vo.getReference());
            }

            if (vo.getDateDebut() != null) {
                item.setDateDebut(DateUtil.parseYYYYMMDDmmhhSS(vo.getDateDebut()));
            }
            if (vo.getDateFin() != null) {
                item.setDateFin(DateUtil.parseYYYYMMDDmmhhSS(vo.getDateFin()));
            }

            if (vo.getMajoration()!= null) {
                item.setMajoration(NumberUtil.toDouble(vo.getMajoration()));
            }
             if (vo.getPenalite()!= null) {
                item.setPenalite(NumberUtil.toDouble(vo.getPenalite()));
            }
              if (vo.getPourcentage() != null) {
                item.setPourcentage(NumberUtil.toDouble(vo.getPourcentage()));
            }

            return item;
        }
        return null;
    }

    @Override
    public TauxTaxeVehiculeVo toVo(TauxTaxeVehicule item) {
        if (item != null) {
            TauxTaxeVehiculeVo vo = new TauxTaxeVehiculeVo();

            if (item.getReference() != null) {
                vo.setReference(item.getReference());
            }

            if (item.getDateDebut() != null) {
                vo.setDateDebut(DateUtil.formatYYYYMMDDmmhhSS(item.getDateDebut()));
            }
            if (item.getDateFin() != null) {
                vo.setDateFin(DateUtil.formatYYYYMMDDmmhhSS(item.getDateFin()));
            }

            if (item.getPourcentage() != 0) {
                vo.setPourcentage(NumberUtil.toString(item.getPourcentage()));
            }
            if (item.getMajoration()!= 0) {
                vo.setMajoration(NumberUtil.toString(item.getMajoration()));
            }
            if (item.getPenalite()!= 0) {
                vo.setPenalite(NumberUtil.toString(item.getPenalite()));
            }

            return vo;
        }
        return null;
    }

}
