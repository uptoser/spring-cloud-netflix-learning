package com.uptoser.spring.cloud.netflix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 在Spring Cloud Edgware之前，要想将微服务注册到Eureka Server或其他服务发现组件上，
 * 必须 在启动类上添加@EnableEurekaClient或@EnableDiscoveryClient。
 */
@EnableFeignClients(basePackages = "com.uptoser")//会扫描指定包下面使用@FeignClient标识的接口
@EnableEurekaClient //标识 是一个Eureka客户端
@SpringBootApplication
public class ProductConsumer_80_Feign {

    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_80_Feign.class, args);
        Logger logger = LoggerFactory.getLogger(ProductConsumer_80_Feign.class);
        logger.info("http://localhost/consumer/product/get/1");
        logger.info("http://localhost/consumer/product/list");
    }

}
