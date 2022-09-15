/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop.Servicesimpl;

import Services.TravelServices;
import com.travelcompany.eshop.traveleshop.CustomerRepositoryImpl;
import com.travelcompany.eshop.traveleshop.ItinerariyRepositoryImpl;
import com.travelcompany.eshop.traveleshop.domain.Category;
import com.travelcompany.eshop.traveleshop.domain.Customers;
import com.travelcompany.eshop.traveleshop.domain.Itineraries;
import com.travelcompany.eshop.traveleshop.domain.Order;
import com.travelcompany.eshop.traveleshop.domain.OrderTickets;
import com.travelcompany.eshop.traveleshop.repository.CustomerRepository;
import com.travelcompany.eshop.traveleshop.repository.IteneraryRepository;
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

    public TravelServicesImpl() {
        customerRepository = new CustomerRepositoryImpl();
        itineraryRepository = new ItinerariyRepositoryImpl();
    }

    @Override
    public void loadCustomerData() {
        System.out.println("------------------The customers are---------------------------");
        for (String currentCustomer : GeneralUtility.customers) {
            String words[] = currentCustomer.split(",");
            //long id, String firstName, String surname, String tel, String email
            Customers customer = new Customers(Long.parseLong(words[0]), words[1], words[2], words[3], words[4], Category.valueOf(words[5]));

            if (GeneralUtility.isValidcustomer(customer)) {
                customerRepository.addCustomer(customer);
            }

            System.out.println(customer);
        }

    }

    @Override
    public void loadItineraryData() {
        System.out.println("---------------------Your choices are ------------------------");
        for (String currentItem : GeneralUtility.itineraries) {
            String words[] = currentItem.split(",");
            //long id, String name, BigDecimal price, Category category
            Itineraries itinerary = new Itineraries(Long.parseLong(words[0]),
                    Category.valueOf(words[1]), (words[2]),
                    (words[3]), Category.valueOf(words[4]), new BigDecimal(words[5]));
            itineraryRepository.addItinerary(itinerary);

            System.out.println(itinerary);
        }

    }

//    @Override
    public Order createOrder(long customerId, long[] itineraryIds) {
        Order order = new Order();
        Customers customer = customerRepository.readCustomer(customerId);
        if (customer == null) return null;
        order.setCustomer(customer);
        order.setDate(LocalDateTime.now());

        for (long itineraryId : itineraryIds) {
            OrderTickets orderTickets = new OrderTickets();
            orderTickets.setOrder(order);
            orderTickets.setItinerary(itineraryRepository.readItinerary(itineraryId));
            orderTickets.setItineraryPrice(itineraryRepository.readItinerary(itineraryId).getBasicPrice());
            orderTickets.setDiscount(BigDecimal.ZERO);
            orderTickets.setQuantity(1);
            
            
            order.getOrderTickets().add(orderTickets);

        }

        return order;
    }

    @Override
    public void displayOrders(long customerId) {
        System.out.println("Order for customer 2" + createOrder(2, new long[]{2,3}));
    }

}
