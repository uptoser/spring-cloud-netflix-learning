package com.uptoser.springcloud.netflix.controller;

import com.uptoser.springcloud.netflix.entities.Product;
import com.uptoser.springcloud.netflix.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 如果需要在自定义类中获取更新配置内容,则需要在此类上添加 @RefreshScope 才会获得更新的内容
 */
//@RefreshScope //刷新配置
@RestController
public class ProductController {

//    @Value("${emp.name}")
//    private String name;
//
//    @GetMapping("/hello")
//    public String hello() {
//        return name;
//    }

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        return productService.get(id);
    }

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }

}
