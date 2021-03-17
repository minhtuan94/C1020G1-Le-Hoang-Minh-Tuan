package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private Integer id;

    @Column(name = "contract_start_date",columnDefinition = "date",nullable = false)
    private String start;

    @Column(name = "contract_end_date",columnDefinition = "date", nullable = false)
    private String end;

    @Column(name = "contract_deposit",nullable = false)
    private Double deposit;

    @Column(name = "contract_total_money",nullable = false)
    private Double totalMoney;

    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName ="customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "employee_id",nullable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "service_id",referencedColumnName = "service_id",nullable = false)
    private Service service;

    @OneToMany(mappedBy = "contract")
    private List<ContractDetail> contractDetails;

    public Contract() {
    }

    public List<ContractDetail> getContractDetailList() {
        return contractDetails;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetails = contractDetailList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
