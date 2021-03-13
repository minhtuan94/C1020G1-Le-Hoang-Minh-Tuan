package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.Cart;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.HashMap;
import java.util.Map;
@Controller
@SessionAttributes("cart")
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping("/")
    public String home(Model model, Pageable pageable) {
        model.addAttribute( "products", productService.findAllProduct( pageable ) );
        return "/home";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable Integer id, Model model) {
        model.addAttribute( "product", productService.findById( id ) );
        return "/view";
    }

    @GetMapping("/product/shopping")
    public String shopping(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute( "message", "Purchase successful !" );
        return "redirect:/";
    }

    @PostMapping("/addcart")
    public String addCart(@ModelAttribute Product product,@RequestParam Integer amount,
                          @ModelAttribute Cart cart, RedirectAttributes redirectAttributes) {
        cart.save( product,amount );
        redirectAttributes.addFlashAttribute( "message",
                "Has successfully added the " + product.getName() + " product to the cart !" );
        return "redirect:/";
    }

    @GetMapping("/view/cart")
    public String viewCart(@ModelAttribute Cart cart) {
        return "/viewcart";
    }

    @GetMapping("/deletecart/{id}")
    public String delete(@PathVariable Integer id, @ModelAttribute("cart") Cart cart, RedirectAttributes redirectAttributes) {
        Product product = productService.findById( id );
        cart.delete( product );
        redirectAttributes.addFlashAttribute( "message",
                "The " + product.getName() + " product has been successfully deleted from your shopping cart" );
        return "redirect:/";
    }

    @GetMapping("/deleteallcart")
    public String deleteAll(@ModelAttribute("cart") Cart cart, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute( "message",
                "The shopping cart has been successfully deleted" );
        cart.deleteAll();
        return "redirect:/";
    }

    @GetMapping("/editcart/{id}")
    public String editCart(@PathVariable Integer id, Model model , @ModelAttribute Cart cart){
        model.addAttribute( "product",productService.findById( id ) );
        return "/editcart";
    }
    @PostMapping("/editcartitem")
    public String editCartItem(@RequestParam Integer amount,@ModelAttribute Product product,@ModelAttribute Cart cart){
        cart.edit( product,amount );
        return "redirect:/";
    }

    @ModelAttribute("cart")
    public Cart cart() {
        return new Cart();
    }


}
