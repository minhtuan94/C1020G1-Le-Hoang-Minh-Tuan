package com.example.demo.service;

import com.example.demo.entity.ServiceType;

import java.util.List;

public interface ServiceTypeService {
    List<ServiceType> findAllServiceType();

    ServiceType findById(Integer id);

    void save(ServiceType serviceType);

    void delete(Integer id);
}
