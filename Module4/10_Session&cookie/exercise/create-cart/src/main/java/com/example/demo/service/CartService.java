package com.example.demo.service;

import com.example.demo.model.Cart;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CartService {
    List<Cart> findAll();
    void save(Cart cart);
    void remove(Integer id);
    Cart findById(int id);
}
