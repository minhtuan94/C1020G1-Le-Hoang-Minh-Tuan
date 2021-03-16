package com.example.demo.service.impl;

import com.example.demo.entity.RentType;
import com.example.demo.repository.RentTypeRepository;
import com.example.demo.service.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeServiceImpl implements RentTypeService {

    @Autowired
    private RentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> findAllRentType() {
        return rentTypeRepository.findAll();
    }

    @Override
    public RentType findById(Integer id) {
        return rentTypeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(RentType rentType) {
        rentTypeRepository.save(rentType);
    }

    @Override
    public void delete(Integer id) {
        rentTypeRepository.deleteById(id);
    }
}
