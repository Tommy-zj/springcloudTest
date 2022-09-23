package org.zhao.test.cloudprovider.controller;

/**
 * @author JJ
 * @version 1.0
 * @description: TODO
 * @date 2022/9/23 10:42:16
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhao.test.cloudprovider.service.HelloService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping("getHello")
    public String getHello() {
        System.out.println("来了老弟：　");
        return helloService.getHello();
    }
}
