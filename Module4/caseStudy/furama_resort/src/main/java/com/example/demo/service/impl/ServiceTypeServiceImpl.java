package com.example.demo.service.impl;

import com.example.demo.entity.ServiceType;
import com.example.demo.repository.ServiceRepository;
import com.example.demo.repository.ServiceTypeRepository;
import com.example.demo.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {

    @Autowired
    private ServiceTypeRepository serviceTypeRepository;


    @Override
    public List<ServiceType> findAllServiceType() {
        return serviceTypeRepository.findAll();
    }

    @Override
    public ServiceType findById(Integer id) {
        return serviceTypeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ServiceType serviceType) {
        serviceTypeRepository.save(serviceType);
    }

    @Override
    public void delete(Integer id) {
        serviceTypeRepository.deleteById(id);
    }
}
