/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop.Servicesimpl;

import CustomerException.CustomerException;
import Services.TravelServices;
import com.travelcompany.eshop.traveleshop.CustomerRepositoryImpl;
import com.travelcompany.eshop.traveleshop.ItinerariyRepositoryImpl;
import com.travelcompany.eshop.traveleshop.OrderRepositoryImpl;
import com.travelcompany.eshop.traveleshop.domain.Customers;
import com.travelcompany.eshop.traveleshop.domain.Itineraries;
import com.travelcompany.eshop.traveleshop.domain.Order;
import com.travelcompany.eshop.traveleshop.domain.OrderTickets;
import com.travelcompany.eshop.traveleshop.repository.CustomerRepository;
import com.travelcompany.eshop.traveleshop.repository.IteneraryRepository;
import com.travelcompany.eshop.traveleshop.repository.OrderRepository;
import com.travelcompany.eshop.traveleshop.utility.GeneralUtility;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author Terry
 */
public class TravelServicesImpl implements TravelServices {

    private final CustomerRepository customerRepository;
    private final IteneraryRepository itineraryRepository;
    private final OrderRepository orderRepository;

    public TravelServicesImpl() {
        customerRepository = new CustomerRepositoryImpl();
        itineraryRepository = new ItinerariyRepositoryImpl();
        orderRepository = new OrderRepositoryImpl();

    }

    @Override
    public void loadCustomerData() {
        System.out.println("------------------The customers are---------------------------");
        for (String currentCustomer : GeneralUtility.customers) {
            String words[] = currentCustomer.split(",");
            try {
                Customers customer = new Customers(
                        Long.parseLong(words[0]), words[1], words[2], 
                        words[3], words[4], words[5]);
                if (GeneralUtility.isValidcustomer(customer)) {
                    customerRepository.addCustomer(customer);
                }
            } catch (CustomerException customerException) {
                System.out.println("The customer has not been added");
            }
        }//

//             
    }

//            System.out.println(Customers);
    @Override
    public void loadItineraryData() {
        System.out.println("---------------------Your choices are ------------------------");
        for (String currentItem : GeneralUtility.itineraries) {
            String words[] = currentItem.split(",");

            Itineraries itinerary = new Itineraries(Long.parseLong(words[0]), 
                    (words[1]), (words[2]), (words[3]), 
                    words[4], new BigDecimal(words[5]));
            itineraryRepository.addItinerary(itinerary);

            System.out.println(itinerary);
        }

    }

    public Order createOrder(long itineraryID, long customerId, long[] itineraryIds) {
        Order order = new Order();
        Customers customer = customerRepository.readCustomer(customerId);
        if (customer == null) {
            return null;
        }
        order.setCustomer(customer);
        order.setDate(LocalDateTime.now());

        for (long itineraryId : itineraryIds) {
            OrderTickets orderTickets = new OrderTickets();
            orderTickets.setOrder(order);
            orderTickets.setItinerary(itineraryRepository.readItinerary(itineraryId));
//            orderTickets.setItineraryPrice(itineraryRepository.readItinerary(itineraryId).getBasicPrice());
            orderTickets.setQuantity(1);

            order.getOrderTickets().add(orderTickets);

        }

        return order;
    }

    @Override
    public void getOrders() {
        for (Order order : orderRepository.getOrder()) {
            System.out.println(order);
        }
    }

    @Override
    public String displayOrders(long customerId) {
        Customers customer = customerRepository.readCustomer(customerId);
        StringBuilder returnValue = new StringBuilder();
        returnValue.append(customer).append("\n");
        for (Order order : orderRepository.readOrder()) {
            if (order.getCustomer().getId() == customerId) {
                returnValue.append(order).append("\n");
            }
        }
        return returnValue.toString();
    }

    @Override
    public String displayOrder(long itineraryId) {
        Order order = orderRepository.readOrder(itineraryId);
        StringBuilder returnString = new StringBuilder();
        returnString.append("Order No. ").append(order.getId()).append("\n")
                .append("Customer: ").append(order.getCustomer()).append("\n")
                .append("Items in the order").append("\n");
        int index = 0;
        for (OrderTickets tickets : order.getOrderTickets()) {
            returnString.append("")
                    .append(++index)
                    .append(". ")
                    .append(tickets)
                    .append("\n");
        }
        return returnString.toString();
    }

    @Override
    public String displayItineraries() {
        StringBuilder returnValue = new StringBuilder();
        returnValue.append("Available items");
        for (Itineraries item : itineraryRepository.readItinerary()) {
            returnValue.append(item);
        }
        returnValue.append("****************-----------------******--\n");
        return returnValue.toString();
    }

    @Override
    public String displayCustomers() {
        StringBuilder returnValue = new StringBuilder();
        returnValue.append("Available customers");
        for (Customers customer : customerRepository.readCustomer()) {
            returnValue.append(customer);
        }
        returnValue.append("************-------------************\n");
        return returnValue.toString();
    }
}
