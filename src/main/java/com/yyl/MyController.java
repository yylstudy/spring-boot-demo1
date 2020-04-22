package com.yyl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: yang.yonglian
 * @CreateDate: 2020/3/17 19:32
 * @Version: 1.0
 */
@RestController
public class MyController {
    @Value("${k8s.env}")
    private String env;

    @RequestMapping("/test1")
    public String test1(){
        return "hello world 555555"+env;
    }
    @RequestMapping("/test2")
    public String test2(){
        return "test2 master";
    }
}
