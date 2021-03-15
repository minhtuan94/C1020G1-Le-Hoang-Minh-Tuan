package com.example.demo.service;

import com.example.demo.entity.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContractService {
    Page<Contract> findById(Pageable pageable);
    Contract findById(Integer id);
    void save(Contract contract);
    void delete(Integer id);
}
