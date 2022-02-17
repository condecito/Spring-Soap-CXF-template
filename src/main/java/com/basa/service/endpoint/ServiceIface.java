/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basa.service.endpoint;

import com.basa.request.BaseRequest;
import com.basa.response.BaseResponse;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ronya
 */
@WebService(targetNamespace = "http://basa.service.hn/",name = "execute")

public interface ServiceIface {
     @WebMethod
     
    public BaseResponse execute(
            /* The input parameter name is userId and the default value is arg0*/
            @WebParam(name = "request")
                    BaseRequest request
    );
    
}
