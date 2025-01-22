package com.uptoser.spring.cloud.netflix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EurekaServer_Config_6001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_Config_6001.class, args);
        Logger logger = LoggerFactory.getLogger(EurekaServer_Config_6001.class);
        logger.info("http://localhost:6001/");
    }

}
