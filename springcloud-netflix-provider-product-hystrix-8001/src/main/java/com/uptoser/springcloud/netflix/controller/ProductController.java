package com.uptoser.springcloud.netflix.controller;

import com.uptoser.springcloud.netflix.entities.Product;
import com.uptoser.springcloud.netflix.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    /**
     * fallbackMethod 指定当get方法出现异常时,将要调用的处理方法
     * 处理方法的返回值和参数类型要一致
     *
     * 可使用注解@HystrixProperty的@commandProperties属性来配置@HystrixCommand
     * 可前往https://github.com/Netflix/Hystrix/tree/master/hystrix-contrib/hystrix-javanica#configuration
     * 详细了解注解@HystrixCommand如何使用
     *
     * HystrixCommand为我们提供了@ignoreExceptions属性，也可借助该属性来配置不想执行回退的异常类
     */
    @HystrixCommand(fallbackMethod = "getFallback")
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        Product product = productService.get(id);
        //如果product为空,则模拟一个异常,
        if(product == null) {
            throw new RuntimeException("ID=" + id + "无效");
        }
        return product;
    }

    /**
     * 我们需要获得造成回退的原因，只需在fallback方法上添加一个Throwable参数即可
     */
    public Product getFallback(@PathVariable("id") Long id,Throwable throwable) {
        return new Product(id, "ID=" + id +"无效----@HystrixCommand",
                "无法找到对应数据库");
    }




    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }

}
