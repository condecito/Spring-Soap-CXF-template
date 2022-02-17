/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basa.service.endpoint;

import com.basa.request.BaseRequest;
import com.basa.response.BaseResponse;
import com.basa.service.repository.ExampleTableRepository;

import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ronya
 */
@WebService(
        endpointInterface = "com.basa.service.endpoint.ServiceIface",
        serviceName = "execute",
        targetNamespace = "http://basa.service.hn/")

public class ServiceImpl implements ServiceIface {

    @Autowired
    private ExampleTableRepository repositoryImp;

//    @Autowired
//    public ServiceImpl(ExampleTableRepository repositoryImp) {
//        this.repositoryImp = repositoryImp;
//    }
    @Override
    public BaseResponse execute(BaseRequest request) {

        BaseResponse response = new BaseResponse();
        response.setFieldA("como estas");
        String h = "";
        if (repositoryImp == null) {
            System.out.println("el repositorio es nulo");
        }
        long i = Long.parseLong(request.getUserId());
        try {
            h = repositoryImp.findAll().get(0).getTitle();
        } catch (Exception s) {
            h = s.getMessage() + "-" + s.toString();
        }
        response.setFieldB(h);
        return response;
    }

}
