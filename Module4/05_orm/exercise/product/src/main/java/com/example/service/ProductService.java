package com.example.service;

import com.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    List<Product> findAll();

    Product findById(int id);

    Product save(Product product);

    boolean exists(int id);

    void delete(int id);
}
