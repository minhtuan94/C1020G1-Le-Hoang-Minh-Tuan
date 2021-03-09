package com.example.demo.controller;

import com.example.demo.model.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("mycounter")
//@SessionAttributes("mycounter") được sử dụng để lưu trữ model attribute
//trong session. Trong đoạn mã trên, model attribute "mycounter"
//sẽ được thêm vào session nếu tên attribute của @ModelAttribute
//và @SessionAttributes giống nhau.
public class CounterController {

    /* add MyCounter in model attribute */
    @ModelAttribute("mycounter")
    public MyCounter setUpCounter() {
        return new MyCounter();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("mycounter") MyCounter myCounter) {
        myCounter.increment();
        return "/index";
    }
}