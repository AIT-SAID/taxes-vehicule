/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.service.impl;

import com.Texes.taxesapiv1.bean.TypeVehicule;
import com.Texes.taxesapiv1.bean.Vehicule;
import com.Texes.taxesapiv1.dao.VehiculeDao;
import com.Texes.taxesapiv1.service.VehiculeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author saida
 */
@Service
public class VehiculeImpl implements VehiculeService {

    @Autowired
    private VehiculeDao vehiculedao;
          

    @Override
    public int creerVehicule(Vehicule vehicule) {
            vehiculedao.save(vehicule);
        return 1;
    }


    @Override
    public Vehicule FindByReference(String reference) {
        return vehiculedao.findByReference(reference);
    }

//    @Override
//    public List<Vehicule> findByRedevableCin(String reference) {
//        return vehiculedao.findByRedevableCin(reference);
//    }
    public VehiculeDao getVehiculedao() {
        return vehiculedao;
    }

    public void setVehiculedao(VehiculeDao vehiculedao) {
        this.vehiculedao = vehiculedao;
    }

    
    

}
