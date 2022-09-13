/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author Terry
 */
public class Itineraries {
    private long id;
    private String DepartureCode,DestinationCode;
    private LocalDateTime date;
    private String airline = "Airline";
    private BigDecimal BasicPrice;

    public Itineraries(long id, String DepartureCode, String DestinationCode,
            LocalDateTime date, BigDecimal BasicPrice) {
        this.id = id;
        this.DepartureCode = DepartureCode;
        this.DestinationCode = DestinationCode;
        this.date = date;
        this.BasicPrice = BasicPrice;
    }

    public Itineraries() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartureCode() {
        return DepartureCode;
    }

    public void setDepartureCode(String DepartureCode) {
        this.DepartureCode = DepartureCode;
    }

    public String getDestinationCode() {
        return DestinationCode;
    }

    public void setDestinationCode(String DestinationCode) {
        this.DestinationCode = DestinationCode;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public BigDecimal getBasicPrice() {
        return BasicPrice;
    }

    public void setBasicPrice(BigDecimal BasicPrice) {
        this.BasicPrice = BasicPrice;
    }

    @Override
    public String toString() {
        return "Itineraries{" + "id=" + id + ", DepartureCode=" + DepartureCode 
                + ", DestinationCode=" + DestinationCode 
                + ", date=" + date + ", airline=" 
                + airline + ", BasicPrice=" + BasicPrice + '}';
    }
    public String header(){
        return "id,DepartureCode,DestinationCode,Date,airline,BasicPrice";
    }
    
    public String toCsv(){
        return   id + "," + DepartureCode 
                + "," + DestinationCode 
                + "," + date + "," 
                + airline + "," + BasicPrice;
    
    }
}
