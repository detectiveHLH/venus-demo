package GROUP.api.controller;

import GROUP.api.dto.HelloDTO;
import GROUP.api.service.impl.HelloServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * RestController
 * 定义为Restful风格的API控制器
 */
@Api("Hello Unit")
@RestController
public class HelloController {

    @Autowired
    private HelloServiceImpl helloService;

    @GetMapping("/hello")
    @ApiOperation("Demo Api for you to understand this project more efficiently")
    public HelloDTO hello() {
        return helloService.sayHello();
    }
}
