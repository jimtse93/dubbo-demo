package com.tse;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tse.IHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jimtse
 * @since 2023-04-23
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Reference
    IHelloService iHelloService;

    @RequestMapping
    public String hello(@RequestParam String name){
        return iHelloService.sayHello(name);
    }
}
