package com.example.demo.web;

import com.example.demo.feign.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xiejun
 * @Date: 2020/08/21/16:11
 * @Description:
 */
@RestController
@RequestMapping("/test/")
public class TestController {
    @Autowired
    private TestApi testApi;
    @RequestMapping("test")
    public String test(){
        return testApi.test();
    }
}
