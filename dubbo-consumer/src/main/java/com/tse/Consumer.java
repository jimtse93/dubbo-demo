package com.tse;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jimtse
 * @since 2023-04-23
 */
@SpringBootApplication
@EnableDubboConfiguration
public class Consumer {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Consumer.class, args);
    }
}
