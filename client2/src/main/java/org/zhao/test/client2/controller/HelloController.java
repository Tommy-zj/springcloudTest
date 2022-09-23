package org.zhao.test.client2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhao.test.client2.service.HelloService;

import javax.annotation.Resource;

/**
 * @author JJ
 * @version 1.0
 * @description: TODO
 * @date 2022/9/23 11:53:26
 */
@RestController
public class HelloController {
    @Resource
    private HelloService helloService;

    @GetMapping("/test")
    public String test() {
        return helloService.getHello();
    }
}
