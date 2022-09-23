package com.zhao.demo.cloudclient.controller;

import com.zhao.demo.cloudclient.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author JJ
 * @version 1.0
 * @description: TODO
 * @date 2022/9/23 10:40:07
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Resource
    private HelloService helloService;

    @GetMapping("get")
    public String get() {
        return helloService.getHello();
    }

}
