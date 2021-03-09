package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String price;
    private String placeOfManufacture;

    public Cart() {
    }

    public Cart(Integer id, String name, String price, String placeOfManufacture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.placeOfManufacture = placeOfManufacture;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPlaceOfManufacture() {
        return placeOfManufacture;
    }

    public void setPlaceOfManufacture(String placeOfManufacture) {
        this.placeOfManufacture = placeOfManufacture;
    }
}
