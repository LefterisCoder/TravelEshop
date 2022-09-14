/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop.domain;

import java.math.BigDecimal;

/**
 *
 * @author Terry
 */
public class OrderedTickets {
    private long id;
    private Customers customer;
    private Itineraries itinerary;
    private String PaymentMethod;
    private BigDecimal PaymentAmount;

    public OrderedTickets() {
    }

    public OrderedTickets(long id, Customers customer, Itineraries itinerary, 
            String PaymentMethod, BigDecimal PaymentAmount) {
        this.id = id;
        this.customer = customer;
        this.itinerary = itinerary;
        this.PaymentMethod = PaymentMethod;
        this.PaymentAmount = PaymentAmount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public Itineraries getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itineraries itinerary) {
        this.itinerary = itinerary;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    public BigDecimal getPaymentAmount() {
        return PaymentAmount;
    }

    @Override
    public String toString() {
        return "OrderedTickets{" + "id=" + id + ", customer=" + customer 
                + ", itinerary=" + itinerary 
                + ", PaymentMethod=" 
                + PaymentMethod + ", PaymentAmount=" + PaymentAmount + '}';
    }

    public void setPaymentAmount(BigDecimal PaymentAmount) {
        this.PaymentAmount = PaymentAmount;
    }
    
//    public String header(){
//    return customer.header()+"," + itinerary.header() + "," + 
//            "PaymentMethod,PaymentAmount";
//    }
//    public String toCsv(){
//        return  id + "," +customer.toCsv() + "," + itinerary.toCsv() + ","  
//                + PaymentMethod + "," +PaymentAmount;
//        
    }
//}
