/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author Terry
 */
public class Itineraries {
    private long id;
    private Category departureCode;
    private String date;
    private String destinationCode;
    private Category airLine;
    private BigDecimal BasicPrice;

    public Itineraries(long id, Category departureCode, String date, String destinationCode, Category airLine, BigDecimal BasicPrice) {
        this.id = id;
        this.departureCode = departureCode;
        this.date = date;
        this.destinationCode = destinationCode;
        this.airLine = airLine;
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

    public Category getDepartureCode() {
        return departureCode;
    }

    public void setDepartureCode(Category departureCode) {
        this.departureCode = departureCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    

    public Category getAirLine() {
        return airLine;
    }

    public void setAirLine(Category airLine) {
        this.airLine = airLine;
    }

    public BigDecimal getBasicPrice() {
        return BasicPrice;
    }

    public void setBasicPrice(BigDecimal BasicPrice) {
        this.BasicPrice = BasicPrice;
    }

    @Override
    public String toString() {
        return "Itineraries{" + "id=" + id + ", departureCode=" + departureCode + 
                ", date=" + date + ", destinationCode=" 
                + destinationCode + ", airLine=" + airLine 
                + ", BasicPrice=" + BasicPrice + '}';
    }

    

   
    }



   

  
//    }
//    public String header(){
//        return "id,DepartureCode,DestinationCode,Date,airline,BasicPrice";
//    }
//    
//    public String toCsv(){
//        return   id + "," + DepartureCode 
//                + "," + DestinationCode 
//                + "," + date + "," 
//                + airline + "," + BasicPrice;
//    
//    }
//}
