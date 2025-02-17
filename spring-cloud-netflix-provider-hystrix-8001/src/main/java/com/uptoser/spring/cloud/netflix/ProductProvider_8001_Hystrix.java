package com.uptoser.spring.cloud.netflix;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix //开启Hystrix的熔断机制
@EnableEurekaClient //将此服务注册到Eureka 服务注册中心
@MapperScan("com.uptoser.springcloud.netflix.mapper")
@SpringBootApplication
public class ProductProvider_8001_Hystrix {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001_Hystrix.class, args);
    }

}
