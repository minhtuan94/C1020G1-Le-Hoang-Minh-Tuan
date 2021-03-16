package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "service_type")

public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_type_id")
    private Integer id;

    @Column(name = "service_type_name", length = 45)
    private String name;

    @OneToMany(mappedBy = "serviceType")
    private List<Service> serviceList;

    public ServiceType() {
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

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }
}
