package com.example.demo.service;
import com.example.demo.entity.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceService {
    Page<Service> findAllService(Pageable pageable);
    Service findById(Integer id);
    void save(Service service);
    void delete(Integer id);
    Page<Service> findAllInputText(String name, Pageable pageable);
    List<Service> findAllService();
}