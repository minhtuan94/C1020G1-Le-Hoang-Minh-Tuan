package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    Page<Employee> findAllEmployee(Pageable pageable);
    Employee findById(Integer id);
    void save(Employee employee);
    void delete(Integer id);
    Page<Employee> findAllInputText(String name, Pageable pageable);
    List<Employee> findAllEmployee();
}
