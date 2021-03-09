package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String index(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products",products);
        return "home";
    }

    @GetMapping("/product/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @GetMapping("/product/{id}/edit")
    public String update(@PathVariable Integer id,Model model) {
        Product product = productService.findById(id);
        model.addAttribute("product",product);
        return "edit";
    }

    @PostMapping("/product/save")
    public String save(@ModelAttribute Product product){
        productService.save(product);
        return "redirect:/";
}


    @GetMapping("/product/{id}/delete")
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        productService.delete(id);
        redirectAttributes.addFlashAttribute("success","delete success");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/view")
    public String view(@PathVariable Integer id,Model model) {
        Product product = productService.findById(id);
        model.addAttribute("product",product);
        return "view";
    }
}