package com.example.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class SpiceController {
    @GetMapping("/home")
    public String spice() {
        return "/home";
    }
    @GetMapping("/")
    public String giavi() {
        return "/home";
    }
    @RequestMapping("/spice")
    public String save(@RequestParam("condiment") String[] condiment, Model model) {
        model.addAttribute("spice", Arrays.toString(condiment));
        return  "/result";
    }
}
