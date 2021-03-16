package com.example.demo.service.impl;

import com.example.demo.repository.ServiceRepository;
import com.example.demo.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public Page<com.example.demo.entity.Service> findAllService(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }
//
//    @Override
//    public List<com.example.demo.entity.Service> findAllService() {
//        return serviceRepository.findAll();
//    }

    @Override
    public com.example.demo.entity.Service findById(Integer id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(com.example.demo.entity.Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void delete(Integer id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public Page<com.example.demo.entity.Service> findAllInputText(String name, Pageable pageable) {
        return serviceRepository.findAllByNameContaining(name, pageable);
    }

}
