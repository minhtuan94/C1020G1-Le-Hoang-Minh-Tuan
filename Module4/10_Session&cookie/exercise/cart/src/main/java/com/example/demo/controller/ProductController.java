package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private ProductService productService;

    @ModelAttribute("cart")
    public Map<Product, Integer> cart(){
        return new HashMap<>();
    }

    @GetMapping("/product/{id}/add")
    public String add(@ModelAttribute("cart") Map<Product, Integer> cart, @PathVariable Integer id, Model model){
        Product product = productService.findById(id);
        if (cart.containsKey(product)){
            cart.replace(product, cart.get(product), cart.get(product) + 1);
        } else {
            cart.put(product, 1);
        }
        model.addAttribute("message","Product added to cart !!");
        model.addAttribute("product", product);
        return "/view";
    }

    @GetMapping("/oder/{id}/reduction")
    public String reduction(@ModelAttribute("cart") Map<Product, Integer> cart,@PathVariable Integer id, Model model){
        Product product = productService.findById(id);
//        cart.put(product, cart.get(product) - 1);
        if (cart.get(product) <= 0){
            model.addAttribute("message","Your shopping cart is empty !!");
        } else {
            // xét value củ của key thành value mới.
            cart.replace(product,cart.get(product),cart.get(product) - 1);
        }
        model.addAttribute("cart", cart);
        return "/viewCart";
    }

    @GetMapping("/oder/{id}/increase")
    public String increase(@ModelAttribute("cart") Map<Product, Integer> cart,@PathVariable Integer id, Model model){
        Product product = productService.findById(id);
        cart.replace(product, cart.get(product), cart.get(product) + 1);
        return "/viewCart";
    }

    @GetMapping("/oder/{id}/delete")
    public String delete(@ModelAttribute("cart") Map<Product, Integer> cart, @PathVariable Integer id, Model model){
        cart.remove(productService.findById(id));
        model.addAttribute("message", "Has deleted the product from the cart !!");
        return "/viewCart";
    }

    @GetMapping("/{id}/cart")
    public String addCart(@ModelAttribute("cart") Map<Product,Integer> cart,@PathVariable Integer id){
        cart.put( productService.findById(id), 1);
        return "redirect:/";
    }

    @GetMapping("/viewCart")
    private String viewCart(){
        return "viewCart";
    }

    @GetMapping("/")
    public String showProduct(Model model){
        model.addAttribute("productList",productService.findAll());
        return "show";
    }

    @GetMapping("/product/{id}/edit")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("productEdit",productService.findById(id));
        return "edit";
    }

    @PostMapping("/product/edit")
    public String update(Product product, RedirectAttributes redirectAttributes){
        productService.save(product);
        redirectAttributes.addFlashAttribute("edited", "Đã chỉnh sửa");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/delete")
    public String delete(@PathVariable Integer id){
        productService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/product/{id}/view")
    public String showView(@PathVariable Integer id, Model model){
        model.addAttribute("productView", productService.findById(id));
        return "view";
    }
}
