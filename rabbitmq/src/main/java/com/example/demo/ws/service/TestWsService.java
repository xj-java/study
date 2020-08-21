package com.example.demo.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xiejun
 * @Date: 2020/08/19/16:34
 * @Description:
 */
@WebService(targetNamespace = "http://abcd.csg.cn")
public interface TestWsService {
    @WebMethod
    @RequestWrapper(localName = "student",targetNamespace = "http://abcd.csg.cn")
    @ResponseWrapper(localName = "result",targetNamespace = "http://abcd.csg.cn")
    @WebResult(name = "str", targetNamespace = "http://abcd.csg.cn")
    String test(@WebParam(targetNamespace = "http://abcd.csg.cn",name = "name") String name,
                @WebParam(targetNamespace = "http://abcd.csg.cn",name = "age") String age);
}
