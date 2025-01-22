package com.uptoser.spring.cloud.netflix.service;


import com.uptoser.springcloud.netflix.entities.Product;

import java.util.List;

/**
 * @Auther: 梦学谷
 */
public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();

}
