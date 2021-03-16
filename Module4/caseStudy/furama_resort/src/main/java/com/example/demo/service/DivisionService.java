package com.example.demo.service;

import com.example.demo.entity.Division;

import java.util.List;

public interface DivisionService {
    List<Division> findAllDivision();
    Division findById(Integer id);
    void save(Division division);
    void delete(Integer id);
}
