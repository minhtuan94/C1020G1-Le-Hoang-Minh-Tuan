package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.entity.CustomerType;
import com.example.demo.service.CustomerService;
import com.example.demo.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerTypeService customerTypeService;
    @ModelAttribute("customerTypes")
    public List<CustomerType> customerTypesList(){
        return customerTypeService.findAllCustomerType();
    }
    @GetMapping("/show")
    public String show(Model model, @RequestParam Optional<String> keyword, @PageableDefault(value = 5) Pageable pageable) {
        String keywordOld = "";
        if (!keyword.isPresent()) {
            model.addAttribute("customerList", customerService.findAllCustomer(pageable));
            model.addAttribute("typesList", customerTypeService.findAllCustomerType());
            return "/customer/show";
        }else {
            keywordOld = keyword.get();
            model.addAttribute("blogTitle", customerService.findAllInputText(keywordOld, pageable));
            model.addAttribute("keywordOld", keywordOld);
            return "customer/show";
        }
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("types",customerTypeService.findAllCustomerType());
        return "/customer/create";
    }

    @PostMapping("/save")
    public String save(Customer customer) {
        customerService.save(customer);
        return "redirect:/customer/show";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model,@PathVariable Integer id){
        model.addAttribute("editCus",customerService.findById(id));
        return "/customer/edit";
    }

    @PostMapping("/edit")
    public String edit(Customer customer,RedirectAttributes redirectAttributes){
        customerService.save(customer);
        return "redirect:/customer/show";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id){
        customerService.delete(id);
        return "redirect:/customer/show";
    }
}