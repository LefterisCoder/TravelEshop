/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Terry
 */
public class Order {
    private long id;
  private Customers customer;
    private LocalDateTime date;
    private final List<OrderTickets> orderTickets = new ArrayList<>();

    public Order() {
    }

    public Order(long id, Customers customer, LocalDateTime date) {
        this.id = id;
        this.customer = customer;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    
    public BigDecimal orderCost() {
        BigDecimal total = new BigDecimal(0);
        for (OrderTickets ot : orderTickets) 
            total.add(ot.TotalCost());
        if (customer instanceof Business)
            return total.multiply(BigDecimal.valueOf(0.9));
        else
            return total.multiply(BigDecimal.valueOf(0.8));
    }
    
}

    
    

