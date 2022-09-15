/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import com.travelcompany.eshop.traveleshop.domain.Order;

/**
 *
 * @author Terry
 */
public interface  TravelServices {
    void loadCustomerData();
    void loadItineraryData();
    Order createOrder(long customerID, long[] itemIds);
    void displayOrders(long customerId);
}
