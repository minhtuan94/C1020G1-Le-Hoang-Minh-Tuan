package com.example.controller;

import com.example.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class TranslateController {
    @Autowired
    private DictionaryService dictionaryService;
    @GetMapping("/")
    public String showTrans() {
        return "/translate";
    }

    @GetMapping("/showTrans")
    public String translate(@RequestParam String eng, Model model) {
       String result = dictionaryService.search(eng);
       model.addAttribute("search",eng);
       model.addAttribute("result",result);
       return "/translate";
    }
}
