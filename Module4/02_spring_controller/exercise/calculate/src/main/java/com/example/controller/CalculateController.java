package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculateController {
    @GetMapping("/")
    public String cal() {
        return "/calc";
    }

    @PostMapping(value = "/calculator")
    public String calc(@RequestParam double num1, @RequestParam double num2, @RequestParam String calc, Model model) {
        double s = 0;
//        if (calc.equals("Addition(+)")) {
//            s = num1 + num2;
//        }else if (calc.equals("Subtraction(-)")){
//            s = num1 - num2;
//        } else if (calc.equals("Multiplication(X)")) {
//            s = num1 * num2;
//        } else if (calc.equals("Division(/)")) {
//            s = num1 / num2;
//        }
        switch (calc) {
            case "Addition(+)":
                s = num1 + num2;
                break;
            case "Subtraction(-)":
                s = num1 - num2;
                break;
            case "Multiplication(X)":
                s = num1 * num2;
                break;
            default:
                s = num1 / num2;
                break;
        }
        model.addAttribute("kq", s);
        return "/calc";
    }
}
