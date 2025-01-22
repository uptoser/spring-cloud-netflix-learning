package com.uptoser.spring.cloud.netflix;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.uptoser.springcloud.netflix.mapper")
@EnableEurekaClient
@SpringBootApplication
public class ProductProvider_Config_8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_Config_8001.class, args);
        Logger logger = LoggerFactory.getLogger(ProductProvider_Config_8001.class);
        logger.info("http://localhost:8001/product/get/1");
        logger.info("http://localhost:8002/product/get/1");
        logger.info("post->http://localhost:8002/actuator/bus-refresh");
    }

}
