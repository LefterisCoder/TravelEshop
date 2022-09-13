/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.travelcompany.eshop.traveleshop.main;

import com.travelcompany.eshop.traveleshop.CustomerBook;
import com.travelcompany.eshop.traveleshop.Customers;
import com.travelcompany.eshop.traveleshop.Itineraries;
import com.travelcompany.eshop.traveleshop.OrderedTickets;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author Terry
 */
public class TravelEshop {
//public OrderedTickets(long id, Customers customer, Itineraries itinerary, 
//            String PaymentMethod, BigDecimal PaymentAmount) {


    public static void main(String[] args) throws FileNotFoundException {
        Customers customer = new Customers(); 
        Itineraries itinerary = new Itineraries();
        OrderedTickets ticket = new OrderedTickets();
        CustomerBook customerBook = new CustomerBook();
//        System.out.println(ticket.header());
//        System.out.println(ticket.toCsv());
//        
//        System.out.println(customerBook.getCustomers());
//        System.out.println(customerBook.toString());
        customerBook.printAllCustomers();
        customerBook.getCategory();
             
       
       
          
        
       
        
//        if(customer.getCategory().equals(Category.BUSINESS)){
//            System.out.println("true dat");
//        }
//       
//        
//        String myOrderedTicketsAsSting = ticket.toCsv();
//        String [] words = myOrderedTicketsAsSting.split(",");
//        for( String Customers : words){
                   
        
    }
}
