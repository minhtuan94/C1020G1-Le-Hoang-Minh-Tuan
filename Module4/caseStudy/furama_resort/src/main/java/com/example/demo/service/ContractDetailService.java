package com.example.demo.service;

import com.example.demo.entity.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContractDetailService {
    Page<ContractDetail> findAllContractDetail(Pageable pageable);
    ContractDetail findContractDetailById(Integer id);
    void save(ContractDetail contractDetail);
    void delete(Integer id);
    Page<ContractDetail> findAllSearch(String name, Pageable pageable);
    List<ContractDetail> findAll();
}
