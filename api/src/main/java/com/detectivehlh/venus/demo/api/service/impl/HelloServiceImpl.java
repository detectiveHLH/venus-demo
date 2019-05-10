package com.detectivehlh.venus.demo.api.service.impl;

import com.detectivehlh.venus.demo.api.dao.HelloMapper;
import com.detectivehlh.venus.demo.api.dto.HelloDTO;
import com.detectivehlh.venus.demo.api.entity.Hello;
import com.detectivehlh.venus.demo.api.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * HelloServiceImpl
 *
 * @author Lunhao Hu
 * @date 2019-05-10 14:30
 **/
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloMapper helloMapper;

    @Override
    public HelloDTO sayHello() {
        List<Hello> list = helloMapper.select();
        System.out.println(list);
        HelloDTO helloDTO = new HelloDTO();
        helloDTO.setMessage("Hello world");
        helloDTO.setCreatedAt(System.currentTimeMillis());
        return helloDTO;
    }
}
