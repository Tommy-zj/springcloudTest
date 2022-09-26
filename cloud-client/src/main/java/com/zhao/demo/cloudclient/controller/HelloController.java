package com.zhao.demo.cloudclient.controller;

import com.zhao.demo.cloudclient.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RefreshScope
public class HelloController {


    @Value("${pattern.dateformat}")
    private String dateformat;

    @Resource
    private HelloService helloService;

    @GetMapping("")
    public String get() {
        System.out.println("获取到的nacos配置中心的配置>>>" + dateformat);
        return helloService.getHello();
    }

}
