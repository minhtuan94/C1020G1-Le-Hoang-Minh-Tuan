package com.example.demo.service;

import com.example.demo.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAllCustomer(Pageable pageable);
    Customer findById(Integer id);
    void save(Customer customer);
    void delete(Integer id);
    Page<Customer> findAllInputText(String name, Pageable pageable);
}
