package com.example.demo.service.impl;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductService productService;
    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productService.findAll(pageable);
    }

    @Override
    public Product findById(Integer id) {
        return productService.findById(id);
    }

    @Override
    public void save(Product blog) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Page<Product> findAllInputText(String name, Pageable pageable) {
        return null;
    }
}
