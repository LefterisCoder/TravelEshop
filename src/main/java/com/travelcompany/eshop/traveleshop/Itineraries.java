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
public class Itineraries {
    private long id;
    private String departureCode;
    private String date;
    private String destinationCode;
    private String airLine;
    private BigDecimal BasicPrice;

    public Itineraries(long id, String departureCode, String destinationCode, String date, String airLine, BigDecimal BasicPrice) {
        this.id = id;
        this.departureCode = departureCode;
        this.destinationCode = destinationCode;
        this.date = date;
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

    public String getDepartureCode() {
        return departureCode;
    }

    public void setDepartureCode(String departureCode) {
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

    

    public String getAirLine() {
        return airLine;
    }

    public void setAirLine(String airLine) {
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
        return "Itineraries{" + "id=" + id + ", departureCode=" + departureCode + ", destinationCode=" + destinationCode
                + ", date=" + date  
                + ", airLine=" + airLine 
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
