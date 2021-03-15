package com.example.demo.service;

import com.example.demo.entity.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> findAllCustomerType();
    CustomerType findById(Integer id);
    void save(CustomerType customerType);
    void delete(Integer id);
}
