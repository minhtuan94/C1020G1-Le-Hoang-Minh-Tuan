package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TranslateController {
    @GetMapping("/")
    public String showTrans() {
        return "/translate";
    }

    @GetMapping("/showTrans")
    public String translate(@RequestParam String eng, Model model) {
        String vn;
        switch (eng) {
            case "person":
                vn = "con người";
                break;
            case "dog":
                vn = "con chó";
                break;
            case "pig":
                vn = "con heo";
                break;
            case "house":
                vn = "căn nhà";
                break;
            default:
                vn = "Not Found";
                break;
        }
        model.addAttribute("vn", vn);
        return "/translate";
    }
}
