package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer_type")
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_type_id")
    private Integer id;

    @Column(name = "customer_type_name", length = 45)
    private String name;

    @OneToMany(mappedBy = "customerType")
    private List<Customer> customerTypes;


    public CustomerType() {
    }

    public List<Customer> getCustomerTypes() {
        return customerTypes;
    }

    public void setCustomerTypes(List<Customer> customerTypes) {
        this.customerTypes = customerTypes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
