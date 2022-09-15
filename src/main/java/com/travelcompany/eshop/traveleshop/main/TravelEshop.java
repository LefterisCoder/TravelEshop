/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.travelcompany.eshop.traveleshop.main;
import Services.TravelServices;
import com.travelcompany.eshop.traveleshop.CustomerRepositoryImpl;
import com.travelcompany.eshop.traveleshop.Servicesimpl.TravelServicesImpl;
import com.travelcompany.eshop.traveleshop.domain.Customers;
import com.travelcompany.eshop.traveleshop.domain.Itineraries;



/**
 *
 * @author Terry
 */
public class TravelEshop {
public static void main(String[] args) {
        Customers customer = new Customers(); 
        Itineraries itinerary = new Itineraries();
       
//        CustomerRepositoryImpl customerBook = new CustomerRepositoryImpl();
//        System.out.println(customerBook.readCustomer());
        TravelServices travelServices = new TravelServicesImpl();
        travelServices.loadCustomerData();
        travelServices.loadItineraryData();
        travelServices.displayOrders(1);
        
    }
}
