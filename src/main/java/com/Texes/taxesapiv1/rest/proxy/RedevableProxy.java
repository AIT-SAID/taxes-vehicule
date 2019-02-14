/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Texes.taxesapiv1.rest.proxy;

import com.Texes.taxesapiv1.rest.vo.RedevableVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author ismail boulaanait
 */
@FeignClient(name = "microservice3-texes", url = "localhost:8099")
public interface RedevableProxy {
    @GetMapping("/taxes-api/redevale/cin/{cin}")
    public RedevableVo findByReference(@PathVariable("cin") String cin);
}
