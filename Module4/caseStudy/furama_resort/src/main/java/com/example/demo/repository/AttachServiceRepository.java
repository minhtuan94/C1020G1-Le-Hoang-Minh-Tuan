package com.example.demo.repository;

import com.example.demo.entity.AttachService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachServiceRepository extends JpaRepository<AttachService,Integer> {
}
