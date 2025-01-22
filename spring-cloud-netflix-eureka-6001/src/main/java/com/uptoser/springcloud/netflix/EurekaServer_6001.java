package com.uptoser.springcloud.netflix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer //标识一个Eureka Server 服务注册中心
@SpringBootApplication
public class EurekaServer_6001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_6001.class, args);
        Logger logger = LoggerFactory.getLogger(EurekaServer_6001.class);
        logger.info("http://localhost:6001/");
    }
}
