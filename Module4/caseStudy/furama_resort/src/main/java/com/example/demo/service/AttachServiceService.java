package com.example.demo.service;

import com.example.demo.entity.AttachService;
import com.example.demo.entity.ContractDetail;
import org.springframework.data.domain.Page;

import java.util.List;

public interface AttachServiceService {
    List<AttachService> findAllAttachService();
    AttachService findById(Integer id);
    void save(AttachService attachService);
    void delete(Integer id);
}
