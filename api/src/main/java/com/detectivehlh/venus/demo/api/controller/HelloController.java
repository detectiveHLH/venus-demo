package com.detectivehlh.venus.demo.api.controller;

import com.detectivehlh.venus.demo.api.dto.HelloDTO;
import com.detectivehlh.venus.demo.api.service.impl.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * RestController
 * 定义为Restful风格的API控制器
 */
@RestController
public class HelloController {

    @Autowired
    private HelloServiceImpl helloService;

    @GetMapping("/hello")
    public HelloDTO hello() {
        return helloService.sayHello();
    }
}
