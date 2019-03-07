/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.service.impl;

import com.Texes.taxesapiv1.bean.TypeVehicule;
import com.Texes.taxesapiv1.bean.Vehicule;
import com.Texes.taxesapiv1.dao.VehiculeDao;
import com.Texes.taxesapiv1.rest.proxy.RedevableProxy;
import com.Texes.taxesapiv1.rest.vo.RedevableVo;
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
    private VehiculeDao vehiculeDao;
    @Autowired
    private RedevableProxy redevableProxy;

    @Override
    public int creerVehicule(Vehicule vehicule) {
        Vehicule v  =findByReference(vehicule.getReference());
                if(v!=null){
    return -1 ;}else  {
            vehiculeDao.save(vehicule);}
        return 1;
   
    }

    @Override
    public List<Vehicule> findByTypeVehiculeReference(String reference) {
        return vehiculeDao.findByTypeVehiculeReference(reference);
    }

    @Override
    public Vehicule findByReference(String reference) {
        return vehiculeDao.findByReference(reference);
    }
    public VehiculeDao getVehiculedao() {
        return vehiculeDao;
    }

    public void setVehiculedao(VehiculeDao vehiculedao) {
        this.vehiculeDao = vehiculedao;
    }

    public VehiculeDao getVehiculeDao() {
        return vehiculeDao;
    }

    public void setVehiculeDao(VehiculeDao vehiculeDao) {
        this.vehiculeDao = vehiculeDao;
    }

    public RedevableProxy getRedevableProxy() {
        return redevableProxy;
    }

    public void setRedevableProxy(RedevableProxy redevableProxy) {
        this.redevableProxy = redevableProxy;
    }

    

}
