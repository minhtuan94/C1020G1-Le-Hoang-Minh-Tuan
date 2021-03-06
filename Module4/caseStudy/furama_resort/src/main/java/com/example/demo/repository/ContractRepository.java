package com.example.demo.repository;

import com.example.demo.entity.Contract;
import com.example.demo.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract,Integer> {
    Page<Contract> findAllByCustomer_Name(String name, Pageable pageable);
}
