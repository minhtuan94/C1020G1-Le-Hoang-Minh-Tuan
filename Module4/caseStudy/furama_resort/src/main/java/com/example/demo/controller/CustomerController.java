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
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
    public List<CustomerType> customerTypesList() {
        return customerTypeService.findAllCustomerType();
    }

    @GetMapping("/show")
    public String show(Model model, @PageableDefault(value = 3) Pageable pageable) {
        model.addAttribute("customerList", customerService.findAllCustomer(pageable));
        return "/customer/show";
    }

    @GetMapping("/search")
    public String listCustomer(Model model, @RequestParam Optional<String> keyword, Pageable pageable) {
        if (!keyword.isPresent()) {
            model.addAttribute("customerList", customerService.findAllCustomer(pageable));
            return "customer/show";
        } else {
            String keywordOld = keyword.get();
            model.addAttribute("customerList", customerService.findAllInputText(keywordOld, pageable));
            return "customer/show";
        }
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "/customer/create";
    }

    @PostMapping("/save")
    public String save(@Validated @ModelAttribute Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "/customer/create";
        }else {
            customerService.save( customer );
            return "redirect:/customer/show";
        }
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable Integer id) {
        model.addAttribute("editCus", customerService.findById(id));
        return "/customer/edit";
    }

    @PostMapping("/edit")
    public String edit1(@Validated @ModelAttribute Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "/customer/edit";
        }else {
            customerService.save( customer );
            return "redirect:/customer/show";
        }
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id) {
        customerService.delete(id);
        return "redirect:/customer/show";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable Integer id, Model model) {
        model.addAttribute("customerView", customerService.findById(id));
        return "/customer/view";
    }
}