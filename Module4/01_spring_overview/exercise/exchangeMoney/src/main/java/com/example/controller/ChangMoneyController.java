package com.example.controller;

import com.example.service.ChangeMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangMoneyController {

@Autowired
private ChangeMoneyService changeMoneyService;

    @PostMapping("/change")
    public String exchange(@RequestParam String num1, @RequestParam String num2, Model model) {
        int result = changeMoneyService.change(Integer.parseInt(num1),Integer.parseInt(num2));
        model.addAttribute("result",result);
        return "/result";
    }

    @GetMapping("/show")
    public String home(){
        return "/show";
    }
}
