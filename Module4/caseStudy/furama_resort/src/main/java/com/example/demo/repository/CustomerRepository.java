package com.example.demo.repository;

import com.example.demo.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Query("select c from Customer c where concat(c.name,c.idCard,c.phone,c.email) like %?1%")
    Page<Customer> findAllByNameContaining(String title, Pageable pageable);
    Customer findCustomerByCode(String code);

}
