package com.uptoser.springcloud.netflix.service;


import com.uptoser.springcloud.netflix.entities.Product;

import java.util.List;

public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();

}
