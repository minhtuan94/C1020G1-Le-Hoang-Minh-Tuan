package com.example.demo.service;

import com.example.demo.entity.RentType;

import java.util.List;

public interface RentTypeService {
    List<RentType> findAllRentType();

    RentType findById(Integer id);

    void save(RentType rentType);

    void delete(Integer id);
}
