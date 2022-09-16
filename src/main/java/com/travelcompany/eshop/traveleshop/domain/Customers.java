/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop.domain;

import CustomerException.CustomerException;
import com.travelcompany.eshop.traveleshop.utility.GeneralUtility;

/**
 *
 * @author Terry
 */
public class Customers {
  private long id;
    private String FullName,Email,Adress,Nationality,Category;
    
    public Customers(long id, String FullName, String Email, String Adress, 
            String Nationality,String Category) throws CustomerException {
        if(!GeneralUtility.isValidEmail(Email))
            throw new CustomerException("Invalid email");
        this.id = id;
        this.FullName = FullName;
        this.Email = Email;
        this.Adress = Adress;
        this.Nationality = Nationality;
        this.Category = Category;
    }


    public Customers() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getEmail() {
        return Email;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

   
    @Override
    public String toString() {
        return "Customers{" + "id=" + id + ", FullName=" + FullName + ", Email=" 
                + Email + ", Adress=" + Adress + 
                ", Nationality=" + Nationality + '}';
    }
}
