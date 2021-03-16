package com.example.demo.service;

import com.example.demo.entity.EducationDegree;
import com.example.demo.entity.Position;

import java.util.List;

public interface PositionService {
    List<Position> findAllPosition();
    Position findById(Integer id);
    void save(Position position);
    void delete(Integer id);
}
