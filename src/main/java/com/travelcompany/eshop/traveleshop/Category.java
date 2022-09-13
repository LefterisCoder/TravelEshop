/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop;

import java.io.Serializable;

/**
 *
 * @author Terry
 */
public enum Category implements Serializable {
    INDIVIDUAL,
    BUSINESS;
    
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
                
        }
        return null;
    }
    
}
