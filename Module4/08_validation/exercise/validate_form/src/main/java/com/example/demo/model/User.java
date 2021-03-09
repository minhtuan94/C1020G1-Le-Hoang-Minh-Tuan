package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.validation.Validator;

@Entity
public class User implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(min = 5, max = 45)
    @NotEmpty
    private String firstName;
    @Size(min = 5, max = 45)
    @NotEmpty
    private String lastName;
    private String phoneNumber;
    @Min(18)
    private Integer age;
    @Pattern(regexp = "([\\w]+@[\\w]+.[a-z]+)",message = "không đúng định dạng")
    private String email;

    public User() {
    }

    public User(String firstName, String lastName, String phoneNumber, Integer age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }
    @Override
    public void validate(Object target, Errors errors) {

        User user = (User) target;
        String phoneNumber = user.getPhoneNumber();
        ValidationUtils.rejectIfEmpty(errors, "phoneNumber", "phoneNumber.empty");
        if (phoneNumber.length()>11 || phoneNumber.length()<10){
            errors.rejectValue("phoneNumber", "phoneNumber.length");
        }
        if (!phoneNumber.startsWith("0")){
            errors.rejectValue("phoneNumber", "phoneNumber.startsWith");
        }
        if (!phoneNumber.matches("(^$|[0-9]*$)")){
            errors.rejectValue("phoneNumber", "phoneNumber.matches");
        }
    }
}
