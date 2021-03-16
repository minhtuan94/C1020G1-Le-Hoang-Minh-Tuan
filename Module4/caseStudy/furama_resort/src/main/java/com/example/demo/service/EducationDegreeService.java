package com.example.demo.service;

import com.example.demo.entity.EducationDegree;

import java.util.List;

public interface EducationDegreeService {
    List<EducationDegree> findAllEducationDegree();
    EducationDegree findById(Integer id);
    void save(EducationDegree educationDegree);
    void delete(Integer id);
}
