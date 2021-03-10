
package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Page<Blog> findAll(Pageable pageable);

    void save(Blog student);
    void update(Blog student);
    Blog findById(int id);

    Page<Blog> findByInputText(String inputSearch, Pageable pageable);
}