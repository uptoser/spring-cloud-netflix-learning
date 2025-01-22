package com.uptoser.spring.cloud.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ConfigClient_8080 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient_8080.class, args);
        System.out.println("http://localhost:8080/config");
        System.out.println("http://localhost:4001/config");
        System.out.println("http://localhost:4002/config");
    }

}
