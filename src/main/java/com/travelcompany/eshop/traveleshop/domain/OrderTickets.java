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
public class OrderTickets {
        
        private Itineraries itinerary;
        private int quantity;
        private BigDecimal itineraryPrice;
        private BigDecimal discount;
        private Order order;

    public OrderTickets() {
    }

    public OrderTickets(Itineraries itinerary, int quantity, BigDecimal itineraryPrice, BigDecimal discount, Order order) {
        this.itinerary = itinerary;
        this.quantity = quantity;
        this.itineraryPrice = itineraryPrice;
        this.discount = discount;
        this.order = order;
    }

    public Itineraries getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itineraries itinerary) {
        this.itinerary = itinerary;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getItineraryPrice() {
        return itineraryPrice;
    }

    public void setItineraryPrice(BigDecimal itineraryPrice) {
        this.itineraryPrice = itineraryPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderTickets{" + "itinerary=" + itinerary + ", quantity=" 
               + quantity + 
                ", itineraryPrice=" + itineraryPrice + 
                ", discount=" + discount + ", order=" + order + '}';
    }
        
        
    
}
