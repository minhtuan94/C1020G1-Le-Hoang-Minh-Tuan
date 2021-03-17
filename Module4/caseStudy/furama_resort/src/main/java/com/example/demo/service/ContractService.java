package com.example.demo.service;

import com.example.demo.entity.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContractService {
    Page<Contract> findAllContract(Pageable pageable);
    Contract findById(Integer id);
    void save(Contract contract);
    void delete(Integer id);
    Page<Contract> findAllInputText(String name, Pageable pageable);
    List<Contract> findAllContract();

//    Page<Contract> findAllByCustomer_Name(String name, Pageable pageable);

}
