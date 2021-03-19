package com.example.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer id;

    @Column(name = "employee_name", length = 45, nullable = false)
    private String name;

    @Column(name = "employee_birthday", columnDefinition = "date", nullable = false)
    private String birthday;

    @NotEmpty(message = "CMND không được trống")
    @Pattern(regexp = "[0-9]{9}|[0-9]{12}", message = "Số CMND phải đúng định dạng XXXXXXXXX hoặc XXXXXXXXXXXX (X là số 0-9)")
    @Column(name = "employee_id_card", length = 45, nullable = false)
    private String idCard;

    @Column(name = "employee_salary", nullable = false)
    private Double salary;

    @NotEmpty(message = "Số điện thoại không được trống")
    @Pattern(regexp = "(09)(0|1)[0-9]{7}|(84\\+)(09)(0|1)[0-9]{7}", message = "Số điện thoại phải đúng định dạng 090xxxxxxx,091xxxxxxx,(84)+90xxxxxxx,(84)+91xxxxxxx")
    @Column(name = "employee_phone",length = 45, nullable = false)
    private String phone;

    @NotEmpty(message = "email không được trống")
    @Email(message = "Địa chỉ email phải đúng định dạng email")
    @Column(name = "employee_email",length = 45)
    private String email;

    @Column(name = "employee_address",length = 45)
    private String address;

    @ManyToOne
    @JoinColumn(name = "position_id", nullable = false)
    private Position position;

    @ManyToOne
    @JoinColumn(name = "education_degree_id", nullable = false)
    private EducationDegree educationDegree;

    @ManyToOne
    @JoinColumn(name = "division_id", nullable = false)
    private Division division;

    @OneToMany(mappedBy = "employee")
    private List<Contract> contract;

    public Employee() {
    }

    public List<Contract> getContract() {
        return contract;
    }

    public void setContract(List<Contract> contract) {
        this.contract = contract;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String id_card) {
        this.idCard = id_card;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }
}
