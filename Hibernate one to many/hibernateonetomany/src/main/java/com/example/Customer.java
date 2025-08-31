package com.example;

import java.util.List;

import jakarta.persistence.*;
@Entity
@Table(name="customer")
public class Customer{

    @Id
    private int id;
    private String name;
    
    @OneToMany(mappedBy="customer", cascade=CascadeType.ALL)
    private List<CustomerOrder> orders;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<CustomerOrder> getOrders() {
        return orders;
    }
    public void setOrders(List<CustomerOrder> orders) {
        this.orders = orders;
    }
}