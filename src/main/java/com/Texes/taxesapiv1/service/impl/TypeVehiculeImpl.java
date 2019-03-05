/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.service.impl;

import com.Texes.taxesapiv1.bean.TypeVehicule;
import com.Texes.taxesapiv1.dao.TypeVehiculeDao;
import com.Texes.taxesapiv1.service.TypeVehiculeService;
import com.Texes.taxesapiv1.service.VehiculeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author saida
 */
@Service
public class TypeVehiculeImpl implements TypeVehiculeService {

    @Autowired
    private TypeVehiculeDao typeVehiculeDao;
    
    @Autowired
    private VehiculeService vehiculeService;
  
    @Override
    public int creerTypeVehicule(TypeVehicule typeVehicule) {
      TypeVehicule type = findByReference(typeVehicule.getReference());
        if (type != null) {
            return -1;
        } else {
            typeVehiculeDao.save(typeVehicule);
            return 1;
        }
        
    }
@Override
    public List<TypeVehicule> findAll() {
        return typeVehiculeDao.findAll();

    }
    @Override
    public TypeVehicule findByReference(String reference) {
        return typeVehiculeDao.findByReference(reference);
    }

    public TypeVehiculeDao getTypeVehiculeDao() {
        return typeVehiculeDao;
    }

    public void setTypeVehiculeDao(TypeVehiculeDao typeVehiculeDao) {
        this.typeVehiculeDao = typeVehiculeDao;
    }

    public VehiculeService getVehiculeService() {
        return vehiculeService;
    }

    public void setVehiculeService(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    

}
