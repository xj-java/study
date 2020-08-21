package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xiejun
 * @Date: 2020/08/21/17:14
 * @Description:
 */
@FeignClient(value = "provider")
public interface TestApi {
    @RequestMapping(value = "/provider/test/test",method = RequestMethod.GET)
    String test();
}
