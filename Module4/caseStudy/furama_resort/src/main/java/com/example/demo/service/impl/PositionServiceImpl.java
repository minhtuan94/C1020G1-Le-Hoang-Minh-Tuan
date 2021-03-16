package com.example.demo.service.impl;

import com.example.demo.entity.Position;
import com.example.demo.repository.PositionRepository;
import com.example.demo.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionRepository positionRepository;

    @Override
    public List<Position> findAllPosition() {
        return positionRepository.findAll();
    }

    @Override
    public Position findById(Integer id) {
        return positionRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Position position) {
        positionRepository.save(position);
    }

    @Override
    public void delete(Integer id) {
        positionRepository.deleteById(id);
    }
}
