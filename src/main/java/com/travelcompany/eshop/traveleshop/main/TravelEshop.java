/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.travelcompany.eshop.traveleshop.main;

import Services.TravelServices;
import com.travelcompany.eshop.traveleshop.CustomerRepositoryImpl;
import com.travelcompany.eshop.traveleshop.ItinerariyRepositoryImpl;
import com.travelcompany.eshop.traveleshop.OrderRepositoryImpl;
import com.travelcompany.eshop.traveleshop.Servicesimpl.TravelServicesImpl;
import com.travelcompany.eshop.traveleshop.domain.Customers;
import com.travelcompany.eshop.traveleshop.domain.Itineraries;
import com.travelcompany.eshop.traveleshop.domain.Order;
import com.travelcompany.eshop.traveleshop.domain.OrderTickets;
import com.travelcompany.eshop.traveleshop.repository.OrderRepository;

/**
 *
 * @author Terry
 */
public class TravelEshop {

    public static void main(String[] args) {
        Customers customer = new Customers();
        Itineraries itinerary = new Itineraries();
        Order order = new Order();
        OrderTickets ordertickets= new OrderTickets();
        CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
        OrderRepositoryImpl orderRepository = new OrderRepositoryImpl();
        ItinerariyRepositoryImpl itineraryRepository = new ItinerariyRepositoryImpl();

        TravelServices travelServices = new TravelServicesImpl();
        travelServices.loadCustomerData();
        travelServices.loadItineraryData();
        customerRepository.addCustomer(customer);
        ordertickets.TotalCost();
        orderRepository.getOrder();
        
       
        

    }
}
