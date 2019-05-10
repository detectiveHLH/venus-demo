package com.detectivehlh.venus.demo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * RestController
 * 定义为Restful风格的API控制器
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "TEST";
    }
}
