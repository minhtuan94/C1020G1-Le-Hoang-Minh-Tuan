package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "customer_type_id",referencedColumnName ="customer_type_id",nullable = false)
    private CustomerType customerType;

    @Column(name = "customer_name",nullable = false,length = 45)
    private String name;

    @Column(name = "customer_birthday",columnDefinition = "date",nullable = false)
    private String birthday;

    @Column(name = "customer_gender",length = 20, nullable = false)
    private String gender;

    @Column(name = "customer_id_card",length = 45,nullable = false)
    private String idCard;

    @Column(name = "customer_phone",length = 45,nullable = false)
    private String phone;

    @Column(name = "customer_email",length = 45)
    private String email;

    @Column(name = "customer_adress",length = 45)
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Contract> contract;

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Contract> getContract() {
        return contract;
    }

    public void setContract(List<Contract> contract) {
        this.contract = contract;
    }
}
