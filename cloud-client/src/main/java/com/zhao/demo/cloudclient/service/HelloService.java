package com.zhao.demo.cloudclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author JJ
 * @version 1.0
 * @description: TODO
 * @date 2022/9/23 10:49:17
 */
@FeignClient(name = "provider", fallback = String.class)
@Service
public interface HelloService {
    @GetMapping(value = "/hello/getHello")
    String getHello();
}
