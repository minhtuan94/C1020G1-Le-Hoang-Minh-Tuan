package com.example.controller;

import com.example.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculateController {

    @Autowired
    private CalculateService calculateService;

    @GetMapping("/")
    public String cal() {
        return "/calc";
    }

    @PostMapping(value = "/calculator")
    public String calc(@RequestParam double a,@RequestParam double b, @RequestParam String calc, Model model) {
        model.addAttribute("kq", calculateService.calculator(a,b,calc));
        return "/calc";
    }
}
