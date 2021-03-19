package com.example.demo.controller;
import com.example.demo.entity.*;
import com.example.demo.service.DivisionService;
import com.example.demo.service.EducationDegreeService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PositionService;
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
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DivisionService divisionService;

    @Autowired
    private EducationDegreeService educationDegreeService;

    @Autowired
    private PositionService positionService;

    @ModelAttribute("positions")
    public List<Position> positionList(){
        return positionService.findAllPosition();
    }

    @ModelAttribute("divisions")
    public List<Division> divisionList(){
        return divisionService.findAllDivision();
    }

    @ModelAttribute("educations")
    public List<EducationDegree> educationDegreesList(){
        return educationDegreeService.findAllEducationDegree();
    }

    @GetMapping("/show")
    public String show(Model model, @RequestParam Optional<String> keyword, @PageableDefault(value = 5) Pageable pageable) {
        String keywordOld = "";
        if (!keyword.isPresent()) {
            model.addAttribute("employeeList", employeeService.findAllEmployee(pageable));
            model.addAttribute("divisionList", divisionService.findAllDivision());
            model.addAttribute("educationList", educationDegreeService.findAllEducationDegree());
            model.addAttribute("positionList", positionService.findAllPosition());
            return "/employee/show";
        }else {
            keywordOld = keyword.get();
            model.addAttribute("customer", employeeService.findAllInputText(keywordOld, pageable));
            model.addAttribute("keywordOld", keywordOld);
            return "employee/show";
        }
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("division",divisionService.findAllDivision());
        model.addAttribute("education",educationDegreeService.findAllEducationDegree());
        model.addAttribute("position",positionService.findAllPosition());
        return "/employee/create";
    }

    @PostMapping("/save")
    public String save(@Validated @ModelAttribute Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "/employee/create";
        }else {
            employeeService.save( employee );
            return "redirect:/employee/show";
        }
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model,@PathVariable Integer id){
        model.addAttribute("editEm",employeeService.findById(id));
        return "/employee/edit";
    }

    @PostMapping("/edit")
    public String edit1(@Validated @ModelAttribute Employee employee, BindingResult bindingResult,Model model) {
        if (bindingResult.hasErrors()){
            return "/employee/edit";
        }else {
            employeeService.save( employee );
            return "redirect:/employee/show";
        }
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id){
        employeeService.delete(id);
        return "redirect:/employee/show";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable Integer id, Model model) {
        model.addAttribute("emView", employeeService.findById( id ) );
        return "/employee/view";
    }
}