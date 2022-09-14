/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop.repository;

import com.travelcompany.eshop.traveleshop.domain.Customers;
import java.util.List;

/**
 *
 * @author Terry
 */
public interface CustomerRepository {
    boolean addCustomer (Customers customer);
    List<Customers> readCustomer();
    Customers readCustomer(long customerID);
    boolean updateCustomer(long customerId,String newEmail);
    
}
