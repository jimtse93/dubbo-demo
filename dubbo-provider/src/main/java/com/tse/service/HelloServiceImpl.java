package com.tse.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.tse.IHelloService;
import org.springframework.stereotype.Component;

/**
 * @author jimtse
 * @since 2023-04-23
 */
@Service
@Component
public class HelloServiceImpl implements IHelloService {
    public String sayHello(String name){
        return "hello" + name;
    }
}
