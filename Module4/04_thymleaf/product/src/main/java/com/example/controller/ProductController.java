package com.example.controller;

import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/")
    public String index(Model model, RedirectAttributes redirect) {
        model.addAttribute("products",productService.findAll());
        redirect.addFlashAttribute("success","");
        return "/index";
    }
}
