package com.example.demo.service.impl;

import com.example.demo.model.Cart;
import com.example.demo.repository.CartRepository;
import com.example.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartRepository cartRepository;

    @Override
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    @Override
    public void save(Cart category) {
        cartRepository.save(category);
    }

    @Override
    public void remove(Integer id) {
        cartRepository.deleteById(id);
    }

    @Override
    public Cart findById(int id) {
        return cartRepository.findById(id).orElse(null);
    }
}
