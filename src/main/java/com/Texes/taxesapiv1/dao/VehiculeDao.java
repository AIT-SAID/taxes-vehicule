/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.dao;

import com.Texes.taxesapiv1.bean.TypeVehicule;
import com.Texes.taxesapiv1.bean.Vehicule;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author saida
 */
@Repository
public interface VehiculeDao extends JpaRepository<Vehicule, Long> {

    public List<Vehicule> findByTypeVehiculeReference(String reference);

    public Vehicule findByReference(String reference);
    public List<Vehicule>  findAll();
    

}
