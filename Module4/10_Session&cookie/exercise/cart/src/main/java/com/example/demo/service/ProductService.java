package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product findById(Integer id);

    void save(Product product);

    void delete(Integer id);

    Page<Product> findAllProduct(Pageable pageable);
}
