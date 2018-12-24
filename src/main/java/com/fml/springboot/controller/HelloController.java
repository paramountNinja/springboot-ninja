package com.fml.springboot.controller;

import com.fml.springboot.autoconfiguration.HelloService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String testHelloService() {
        return helloService.getMsg();
    }
}
