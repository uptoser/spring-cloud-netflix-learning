package com.uptoser.springcloud.netflix.mapper;

import com.uptoser.springcloud.netflix.entities.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}