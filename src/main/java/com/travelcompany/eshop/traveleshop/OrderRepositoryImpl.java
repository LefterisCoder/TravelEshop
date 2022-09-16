/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop;


import com.travelcompany.eshop.traveleshop.domain.Order;
import com.travelcompany.eshop.traveleshop.repository.OrderRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Terry
 */
public class OrderRepositoryImpl implements OrderRepository {

    private final ArrayList<Order> orders ;
    
    public OrderRepositoryImpl(){
        orders= new ArrayList<>();{
    
    }
    }
    @Override
    public boolean addOrder(Order orders) {
        return true;
    }

  
    @Override
     public List<Order> readOrder(){
        return orders;
        
        
    }

   public Order readOrder(long id){
//        for (int index = 0; index < orders.size(); index ++){
//            if (orders.get(index).getId() == id)
//                return orders.get(index);
//        }
//        
        for (Order order:orders){
            if (order.getId()== id){
                   return order;
            }
        }
        return null; 
    }

  public boolean updateOrder(long orderId, BigDecimal newPrice){
        Order order = readOrder(orderId);
        if( order == null) return false;
        
         
        return true;
    }
@Override
    public List<Order> getOrder() {
            
             return orders;   
    }
    
  
}
