package com.uptoser.spring.cloud.netflix;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 在Spring Cloud Edgware之前，要想将微服务注册到Eureka Server或其他服务发现组件上，
 * 必须 在启动类上添加@EnableEurekaClient或@EnableDiscoveryClient。
 *
 * 在SpringCloud Edgware以及更高版本中，只需添加相关依赖，即可自动注册。若不想将服务注册到 EurekaServer，
 * 只需设置spring.cloud.service-registry.auto-registration.enabled=false，
 * 或@EnableDiscoveryClient(auto-Register=false)即可。
 */
@EnableEurekaClient //将此服务注册到Eureka 服务注册中心
@MapperScan("com.uptoser.springcloud.netflix.mapper")
@SpringBootApplication
public class ProductProvider_8002 {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8002.class, args);
        Logger logger = LoggerFactory.getLogger(ProductProvider_8002.class);
        logger.info("http://localhost:8002/product/get/1");
    }

}
