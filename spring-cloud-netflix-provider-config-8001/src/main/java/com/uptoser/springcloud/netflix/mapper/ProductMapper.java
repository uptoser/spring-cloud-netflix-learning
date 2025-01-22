package com.uptoser.springcloud.netflix.mapper;

import com.uptoser.springcloud.netflix.entities.Product;

import java.util.List;

public interface ProductMapper {
    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}