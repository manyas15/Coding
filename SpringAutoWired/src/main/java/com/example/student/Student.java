package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name;
    @Autowired
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Address: " + address.getStreet() + ", " + address.getCity());
    }
}
