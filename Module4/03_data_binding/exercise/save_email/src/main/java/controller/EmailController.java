package controller;

import model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmailController {

    @GetMapping("/")
    public String showEmail(Model model){
        model.addAttribute("email", new Email("English","25","abc","Thor"));
        return "/views";
    }

    @PostMapping(value = "/email",produces = "text/plain;charset=UTF-8")
    public String submit(@ModelAttribute("email") Email email, BindingResult result, Model model) {
        model.addAttribute("language", email.getLanguage());
        model.addAttribute("pageSize", email.getPageSize());
        model.addAttribute("spams", email.getSpamsFilter());
        model.addAttribute("sign", email.getSignature());
        return "/views";
    }
}