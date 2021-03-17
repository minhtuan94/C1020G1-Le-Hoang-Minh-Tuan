package com.example.demo.controller;

import com.example.demo.entity.AttachService;
import com.example.demo.entity.Contract;
import com.example.demo.entity.ContractDetail;
import com.example.demo.service.AttachServiceService;
import com.example.demo.service.ContractDetailService;
import com.example.demo.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/contract_detail")
public class ContractDetailController {

    @Autowired
    private ContractDetailService contractDetailService;

    @Autowired
    private AttachServiceService attachServiceService;

    @Autowired
    private ContractService contractService;

    @ModelAttribute("attach")
    public List<AttachService> attachService(){
        return attachServiceService.findAllAttachService();
    }

    @ModelAttribute("contract_detail")
    public List<ContractDetail> details(){
        return contractDetailService.findAll();
    }

    @GetMapping("/show")
    public String show(Model model, @RequestParam Optional<String> keyword, @PageableDefault(value = 5) Pageable pageable) {
        String keywordOld = "";
        if (!keyword.isPresent()) {
            model.addAttribute("contractDetailList", contractDetailService.findAllContractDetail(pageable));
            model.addAttribute("attachServiceList", attachServiceService.findAllAttachService());
            model.addAttribute("contractList", contractService.findAllContract(pageable));
            return "/contract_detail/show";
        }else {
            keywordOld = keyword.get();
            model.addAttribute("detail", contractDetailService.findAllSearch(keywordOld, pageable));
            model.addAttribute("keywordOld", keywordOld);
            return "contract_detail/show";
        }
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("detail", new ContractDetail());
        model.addAttribute("contracts",contractService.findAllContract());
        model.addAttribute("attach",attachServiceService.findAllAttachService());
        return "/contract_detail/create";
    }

    @PostMapping("/save")
    public String save(ContractDetail contractDetail) {
        contractDetailService.save(contractDetail);
        return "redirect:/contract_detail/show";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id){
        contractDetailService.delete(id);
        return "redirect:/contract_detail/show";
    }
}
