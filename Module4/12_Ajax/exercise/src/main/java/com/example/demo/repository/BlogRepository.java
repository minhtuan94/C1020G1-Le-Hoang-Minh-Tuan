package com.example.demo.repository;

import com.example.demo.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

    Page<Blog> findAllByNameContaining(Pageable pageable, String name);

    @Query(value = "select *from blog where `name` like %?1%", nativeQuery = true)
    List<Blog> searchBlogName(String name);
}