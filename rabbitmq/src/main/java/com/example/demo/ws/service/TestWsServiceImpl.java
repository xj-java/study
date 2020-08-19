package com.example.demo.ws.service;

import com.netflix.discovery.provider.Serializer;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xiejun
 * @Date: 2020/08/19/16:37
 * @Description:
 */
@Service
@WebService(targetNamespace = "http://service.ws.demo.example.com",endpointInterface = "com.example.demo.ws.service.TestWsService")
public class TestWsServiceImpl implements TestWsService {
    @Override
    public String test(String name,String age) {
        return name+"-"+age;
    }
}
