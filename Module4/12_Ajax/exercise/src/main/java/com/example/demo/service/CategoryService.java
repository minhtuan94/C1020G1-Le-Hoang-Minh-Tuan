package com.example.demo.service;

import com.example.demo.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAllCategory();

    void saveCategory(Category category);

    void deleteCategory(Integer id);

    Category findCategoryById(Integer id);

}