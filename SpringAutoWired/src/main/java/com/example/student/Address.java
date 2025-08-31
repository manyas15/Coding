package com.example.student;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String street;
    private String city;

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }
}
