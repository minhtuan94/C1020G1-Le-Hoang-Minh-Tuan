package com.example.demo.service;

import com.example.demo.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService  {
    List<Category> findAll();
    void save(Category category);
    void remove(Integer id);
    Category findById(int id);
}