package com.uptoser.spring.cloud.netflix.controller;

import com.uptoser.springcloud.netflix.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Auther: 梦学谷
 */
@RestController
public class ProductController_Consumer {

    //private static final String REST_URL_PREFIX = "http://localhost:8001";

    /*
    修改为商品提供者向Eureka服务器中注册的地址
    microservice-product是用户微服务的虚拟主机名（virtual host name），
    当Ribbon和Eureka配合使用时，会自动将虚拟主机名映射成微服务的网络地址
     */
    private static final String REST_URL_PREFIX = "http://microservice-product";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/product/add", product, Boolean.class);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/get/" + id, Product.class);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/list", List.class);
    }



}
