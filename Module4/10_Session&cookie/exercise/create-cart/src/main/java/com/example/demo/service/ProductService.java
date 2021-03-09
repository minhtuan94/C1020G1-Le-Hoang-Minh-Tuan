package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);
    Product findById(Integer id);
    void save(Product product);
    void remove(int id);
    Page<Product> findAllInputText(String name, Pageable pageable);
}
