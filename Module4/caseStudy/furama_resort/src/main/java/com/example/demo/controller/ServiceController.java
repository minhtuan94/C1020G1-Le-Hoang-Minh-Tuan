package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Service;
import com.example.demo.service.RentTypeService;
import com.example.demo.service.ServiceService;
import com.example.demo.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @Autowired
    private ServiceTypeService serviceTypeService;

    @Autowired
    private RentTypeService rentTypeService;

    @GetMapping("/show")
    public String show(Model model, @RequestParam Optional<String> keyword, @PageableDefault(value = 5) Pageable pageable){
        String keywordOld = "";
        if (!keyword.isPresent()) {
            model.addAttribute("serviceList", serviceService.findAllService(pageable));
            model.addAttribute("serviceTypeList", serviceTypeService.findAllServiceType());
            model.addAttribute("rentTypeList",rentTypeService.findAllRentType());
            return "/service/show";
        }else {
            keywordOld = keyword.get();
            model.addAttribute("service", serviceService.findAllInputText(keywordOld, pageable));
            model.addAttribute("keywordOld", keywordOld);
            return "service/show";
        }
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("service", new Service());
        model.addAttribute("serviceTypes",serviceTypeService.findAllServiceType());
        model.addAttribute("rentTypes",rentTypeService.findAllRentType());
        return "/service/create";
    }

    @PostMapping("/save")
    public String save(Service service) {
        serviceService.save(service);
        return "redirect:/service/show";
    }


}
