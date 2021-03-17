package com.example.demo.repository;

import com.example.demo.entity.Contract;
import com.example.demo.entity.ContractDetail;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractDetailRepository extends JpaRepository<ContractDetail,Integer> {
    Page<ContractDetail> findAllByContractContractDetailList(String name, Pageable pageable);
}
