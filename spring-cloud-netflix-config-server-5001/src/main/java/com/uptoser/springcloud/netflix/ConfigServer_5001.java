package com.uptoser.springcloud.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class ConfigServer_5001 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_5001.class, args);
        System.out.println("http://localhost:5001/microservice-config-application-dev.yml");
        System.out.println("http://localhost:5001/microservice-config-application-prod.yml");
        System.out.println("http://localhost:5001/microservice-config-application-test.yml");
        System.out.println("http://localhost:5001/microservice-config-eureka-dev.yml");
        System.out.println("http://localhost:5001/microservice-config-product-dev.yml");
    }

}
