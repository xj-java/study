package com.example.demo.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xiejun
 * @Date: 2020/08/19/16:34
 * @Description:
 */
@WebService
public interface TestWsService {
    @WebMethod
    @WebResult
    String test();
}
