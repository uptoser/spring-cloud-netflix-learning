package com.uptoser.spring.cloud.netflix.service.impl;

import com.uptoser.spring.cloud.netflix.mapper.ProductMapper;
import com.uptoser.spring.cloud.netflix.service.ProductService;
import com.uptoser.springcloud.netflix.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //一定不要少了
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public boolean add(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public Product get(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }

}
