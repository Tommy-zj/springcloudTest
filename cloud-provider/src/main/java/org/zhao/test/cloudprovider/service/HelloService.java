package org.zhao.test.cloudprovider.service;

import org.springframework.stereotype.Service;

/**
 * @author JJ
 * @version 1.0
 * @description: TODO
 * @date 2022/9/23 10:42:01
 */

@Service
public class HelloService {
    public String getHello() {
        return "你好呀兄弟!";
    }
}
