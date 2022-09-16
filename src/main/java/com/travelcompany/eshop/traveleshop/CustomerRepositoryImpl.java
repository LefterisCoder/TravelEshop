/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop;

import com.travelcompany.eshop.traveleshop.domain.Customers;
import com.travelcompany.eshop.traveleshop.repository.CustomerRepository;
import com.travelcompany.eshop.traveleshop.utility.GeneralUtility;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Terry
 */
public class CustomerRepositoryImpl implements CustomerRepository {

    private final ArrayList<Customers> customers;

    public CustomerRepositoryImpl() {
        customers = new ArrayList<>();

    }

    @Override
    public boolean addCustomer(Customers customer) {
          for (int index = 0; index < customers.size(); index++){
            if (customers.get(index).getId()== customer.getId() )
                return false;
        }
        
        if (! GeneralUtility.isValidcustomer(customer)) 
           return false;
        customers.add(customer);
        return true;
    }
    

    @Override
    public List<Customers> readCustomer() {
        return customers;
    }

    @Override
    public Customers readCustomer( long id) {
        for (Customers customer : customers) {

            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public boolean updateCustomer(long customerId, String newEmail) {
        Customers customer = readCustomer(customerId);
        if (customer == null) {
            return false;
        }

        for (Customers curCustomer : customers) {
            if (curCustomer.getEmail() != null && curCustomer.getEmail().equals(newEmail)) {
                return false;
            }
        }

        customer.setEmail(newEmail);
        return true;
    }
}

