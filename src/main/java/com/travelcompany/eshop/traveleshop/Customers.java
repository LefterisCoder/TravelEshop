/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop;



/**
 *
 * @author Terry
 */
public class Customers {
    private long id;
    private String FullName,Email,Adress,Nationality;
    private Category category;
    

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

  

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getEmail() {
        return Email;
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

    public Customers(long id, String FullName, String Email, String Adress, 
            String Nationality, Category category) {
        this.id = id;
        this.FullName = FullName;
        this.Email = Email;
        this.Adress = Adress;
        this.Nationality = Nationality;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Customers{" + "id=" + id + ", FullName=" + FullName + ", Email=" 
                + Email + ", Adress=" + Adress + 
                ", Nationality=" + Nationality + ", category=" + category + '}';
    }

  

  
    
   public String header(){
       return  "id, FullName,Email,Adress,Nationality" ;
            
   }
    public String toCsv(){
        return  id + "," + FullName 
                + "," + Email + "," + Adress 
                + "," + Nationality;
    }
}
