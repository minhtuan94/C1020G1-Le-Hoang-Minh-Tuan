package com.example.demo.service.impl;

import com.example.demo.entity.AttachService;
import com.example.demo.entity.ContractDetail;
import com.example.demo.repository.AttachServiceRepository;
import com.example.demo.service.AttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceServiceImpl implements AttachServiceService {

    @Autowired
    private AttachServiceRepository attachServiceRepository;


    @Override
    public List<AttachService> findAllAttachService() {
        return attachServiceRepository.findAll();
    }

    @Override
    public AttachService findById(Integer id) {
        return attachServiceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(AttachService attachService) {
        attachServiceRepository.save(attachService);
    }

    @Override
    public void delete(Integer id) {
        attachServiceRepository.deleteById(id);
    }
}
