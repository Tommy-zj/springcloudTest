package org.zhao.test.client2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author JJ
 * @version 1.0
 * @description: TODO
 * @date 2022/9/23 11:51:56
 */
@FeignClient("provider")
@Service
public interface HelloService {
    @GetMapping("/hello/getHello")
    String getHello();
}
