/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basa.configuration;

import com.basa.response.BaseResponse;
import com.basa.service.endpoint.ServiceIface;
import com.basa.service.endpoint.ServiceImpl;
import com.basa.service.repository.ExampleTableRepository;
import com.jayway.jsonpath.spi.json.JacksonJsonProvider;
import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxrs.swagger.Swagger2Feature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author ronya
 */
@Configuration
@EnableJpaRepositories(basePackages = {"com.basa.service.repository"})
public class SpringBootConfiguration {

    private final String servicename = "";
    @Autowired
    private Bus bus;

    @Bean
    public ServiceImpl serviceImpl() {
        return new ServiceImpl();
    }

    @Bean
    public ServletRegistrationBean createServlet() {

        //ruteo del servicio
        return new ServletRegistrationBean(new CXFServlet(), "/ws/v1/*");
    }

    //publica el servicio en el path indicado
    @Bean
    public Endpoint serviceEndPoint() {
        EndpointImpl endpoint = new EndpointImpl(bus,serviceImpl());
        endpoint.publish("/service");
        return endpoint;
    }

}
