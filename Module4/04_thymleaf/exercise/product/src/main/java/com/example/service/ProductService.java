package com.example.service;

import com.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product customer);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
