/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Terry
 */
public class Order {
    private Customers customer;
    private LocalDateTime date;
    private final List<OrderTickets> orderTickets = new ArrayList<>();

    public Order() {
    }

    public Order(Customers customer, LocalDateTime date) {
        this.customer = customer;
        this.date = date;
    }

    public List<OrderTickets> getOrderTickets(){
         return orderTickets;
    }
    
    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    
    
}
