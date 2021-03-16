package com.example.demo.service.impl;

import com.example.demo.entity.Division;
import com.example.demo.repository.DivisionRepository;
import com.example.demo.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {

    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    public List<Division> findAllDivision() {
        return divisionRepository.findAll();
    }

    @Override
    public Division findById(Integer id) {
        return divisionRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Division division) {
        divisionRepository.save(division);
    }

    @Override
    public void delete(Integer id) {
        divisionRepository.deleteById(id);
    }
}
