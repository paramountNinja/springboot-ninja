package com.fml.springboot.controller;


import com.fml.springboot.exception.CustomerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Value("${fml.id}")
    private long id;
    @Value("${fml.name}")
    private String name;

    @Value("${number}")
    private int number;

    @RequestMapping("/")
    public String sayHalo() {
        return "hello, " + this.name + ", your id is "
                + this.id + ", random_number is " + this.number;
    }

    @RequestMapping("exception")
    public String exceptionHappen() throws Exception {
        //throw new Exception("发生错误");
        logger.info("any error?");
        throw new CustomerException("101", "发生自定义异常");
    }
}
