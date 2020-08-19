package com.example.demo.ws.config;

import com.example.demo.ws.service.TestWsService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xiejun
 * @Date: 2020/08/19/16:39
 * @Description:
 */
@Configuration
public class CxfConfig {
    @Autowired
    private TestWsService testWsService;

    @Bean
    public ServletRegistrationBean wsServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new CXFServlet(), "/soap/*");
        return bean;
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public Endpoint testWsService() {
        //会找到O2oWebService的实现类，所以实现类只能有一个
        EndpointImpl endpoint = new EndpointImpl(springBus(), testWsService);

        endpoint.publish("/testWsService");

        return endpoint;
    }
}
