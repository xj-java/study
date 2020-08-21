package com.example.demo.web.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping("test")
    public String test(){
        return "服务B被调用";
    }
}
