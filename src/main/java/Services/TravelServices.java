/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import com.travelcompany.eshop.traveleshop.domain.Order;
import com.travelcompany.eshop.traveleshop.domain.OrderTickets;

/**
 *
 * @author Terry
 */
public interface TravelServices {

    void loadCustomerData();

    void loadItineraryData();

    Order createOrder(long itineraryId, long customerID, long[] itineraryIds);

    String displayOrders(long customerId);

    String displayOrder(long itineraryId);

    String displayItineraries();

    String displayCustomers();

    void getOrders();

}
