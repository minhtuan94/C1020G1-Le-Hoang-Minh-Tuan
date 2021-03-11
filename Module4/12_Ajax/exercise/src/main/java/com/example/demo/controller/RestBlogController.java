package com.example.demo.controller;

import com.example.demo.entity.Blog;
import com.example.demo.entity.Category;
import com.example.demo.service.BlogService;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Controller
@RequestMapping("/blogRest")
@CrossOrigin("*")
public class RestBlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/viewAllListCategory")
    public ResponseEntity<List<Category>> getListCategory() {
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/viewAllListBlog")
    public ResponseEntity<List<Blog>> getListBlog() {
        return new ResponseEntity<>(blogService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/viewCategory/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable Integer id) {
        return new ResponseEntity<>(categoryService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/viewBlog/{id}")
    public ResponseEntity<Blog> getBlog(@PathVariable Integer id) {
        return new ResponseEntity<>(blogService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/viewAllListBlog/{name}")
    public ResponseEntity<List<Blog>> getNameBlog(@PathVariable String name) {
        if (name.equals("") || name == null) {
            return new ResponseEntity<>(blogService.findAll(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(blogService.searchBlogName(name), HttpStatus.OK);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Void> registerStudent(@RequestBody Blog blog, UriComponentsBuilder ucBuilder) {
        this.blogService.save(blog);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/blogRest/detail/{id}").buildAndExpand(blog.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
}