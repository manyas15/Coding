/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import jakarta.persistence.ManyToOne;

class CustomerOrder {
    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    public void setId(int id) {
        this.id = id;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public int getId() {
        return id;
    }
    public String getProduct() {
        return product;
    }
}
