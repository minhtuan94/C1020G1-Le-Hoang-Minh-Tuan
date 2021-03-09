package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.CartService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;
    @Autowired
    CartService cartService;
    @GetMapping("/")
    public String show(Model model, @RequestParam Optional<String> keyword, @PageableDefault(value = 3) Pageable pageable){
        String keywordOld = "";
        if (!keyword.isPresent()) {
            model.addAttribute("product", productService.findAll(pageable));
            model.addAttribute("cart", cartService.findAll());
            return "/show";
        } else {
            keywordOld = keyword.get();
            model.addAttribute("product", productService.findAllInputText(keywordOld, pageable));
            model.addAttribute("cart", keywordOld);
            return "/show";
        }
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("product", new Product());
        model.addAttribute("cart", cartService.findAll());
        return "/create";
    }
    @PostMapping("/save")
    public String save( Product product){
        productService.save(product);
        return "redirect:/";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("blogEdit", productService.findById(id));
        model.addAttribute("category", cartService.findAll());
        return "/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Product product, RedirectAttributes redirectAttributes){
        productService.save(product);
//        redirectAttributes.addFlashAttribute("message", "successful");
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes){
        productService.remove(id);
        return "redirect:/";
    }

}