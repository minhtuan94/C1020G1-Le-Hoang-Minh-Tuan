package com.example.demo.service.impl;

import com.example.demo.entity.ContractDetail;
import com.example.demo.repository.ContractDetailRepository;
import com.example.demo.service.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailServiceImpl implements ContractDetailService {

    @Autowired
    private ContractDetailRepository contractDetailRepository;


    @Override
    public Page<ContractDetail> findAllContractDetail(Pageable pageable) {
        return contractDetailRepository.findAll(pageable);
    }

    @Override
    public ContractDetail findContractDetailById(Integer id) {
        return contractDetailRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }

    @Override
    public void delete(Integer id) {
        contractDetailRepository.deleteById(id);
    }

    @Override
    public Page<ContractDetail> findAllSearch(String name, Pageable pageable) {
        return contractDetailRepository.findAllByContractContractDetailList(name, pageable);
    }

    @Override
    public List<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }
}
