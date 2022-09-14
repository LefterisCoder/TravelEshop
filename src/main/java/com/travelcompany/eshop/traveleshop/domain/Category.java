/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop.domain;

import java.io.Serializable;

/**
 *
 * @author Terry
 */
public enum Category implements Serializable {
    INDIVIDUAL,
    BUSINESS,
    DEPARTURECODE,
    AIRLINE,
    CASH,
    CREDITCARD;
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        switch(this){
            case INDIVIDUAL -> {
                return "Individual";
            }
            case BUSINESS -> {
                return "Business";
            }
            case DEPARTURECODE -> {
                return "ATH";
            }
            case AIRLINE -> {
                return "SkyLines";
                
            }
            case CASH -> {
                return "Cash";
            }
            case CREDITCARD -> {
                return "Credit Card";
            }
                
        }
        return null;
    }
    
}
