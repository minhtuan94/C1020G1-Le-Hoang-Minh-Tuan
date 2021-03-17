package com.example.demo.controller;

import com.example.demo.entity.Contract;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Service;
import com.example.demo.service.ContractService;
import com.example.demo.service.CustomerService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    private ContractService contractService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ServiceService serviceService;

    @Autowired
    private EmployeeService employeeService;

    @ModelAttribute("customers")
    public List<Customer> customers(){
        return customerService.findAllCustomer();
    }

    @ModelAttribute("services")
    public List<Service> services(){
        return serviceService.findAllService();
    }

    @ModelAttribute("employees")
    public List<Employee> employees(){
        return employeeService.findAllEmployee();
    }

    @GetMapping("/show")
    public String show(Model model, @RequestParam Optional<String> keyword, @PageableDefault(value = 5) Pageable pageable) {
        String keywordOld = "";
        if (!keyword.isPresent()) {
            model.addAttribute("customerContractList", customerService.findAllCustomer(pageable));
            model.addAttribute("serviceContractList", serviceService.findAllService(pageable));
            model.addAttribute("contractList", contractService.findAllContract(pageable));
            model.addAttribute("employeeContractList", employeeService.findAllEmployee(pageable));
            return "/contract/show";
        }else {
            keywordOld = keyword.get();
            model.addAttribute("contract", contractService.findAllInputText(keywordOld, pageable));
            model.addAttribute("keywordOld", keywordOld);
            return "contract/show";
        }
    }

    @GetMapping("/create")
    public String create(Model model, Pageable pageable) {
        model.addAttribute("con", new Contract());
        model.addAttribute("cus",customerService.findAllCustomer(pageable));
        model.addAttribute("ser",serviceService.findAllService(pageable));
        model.addAttribute("ems",employeeService.findAllEmployee(pageable));
        return "/contract/create";
    }

    @PostMapping("/save")
    public String save(Contract contract) {
        contractService.save(contract);
        return "redirect:/contract/show";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model,@PathVariable Integer id){
        model.addAttribute("editCon",contractService.findById(id));
        model.addAttribute("editCus",customerService.findById(id));
        model.addAttribute("editSer",serviceService.findById(id));
        model.addAttribute("editEms",employeeService.findById(id));
        return "/contract/edit";
    }

    @PostMapping("/edit")
    public String edit(Contract contract){
        contractService.save(contract);
        return "redirect:/contract/show";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id){
        contractService.delete(id);
        return "redirect:/contract/show";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable Integer id, Model model) {
        model.addAttribute( "contractView", contractService.findById(id));
        return "/contract/view";
    }
}
