package com.example.demo.service.impl;
import com.example.demo.entity.CustomerType;
import com.example.demo.repository.CustomerTypeRepository;
import com.example.demo.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeImpl implements CustomerTypeService {

    @Autowired
    private CustomerTypeRepository customerTypeRepository;


    @Override
    public List<CustomerType> findAllCustomerType() {
        return customerTypeRepository.findAll();
    }

    @Override
    public CustomerType findById(Integer id) {
        return customerTypeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(CustomerType customerType) {
        customerTypeRepository.save(customerType);
    }

    @Override
    public void delete(Integer id) {
        customerTypeRepository.deleteById(id);
    }
}
