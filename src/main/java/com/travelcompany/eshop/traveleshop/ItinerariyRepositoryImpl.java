/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop;


import com.travelcompany.eshop.traveleshop.domain.Itineraries;
import com.travelcompany.eshop.traveleshop.repository.IteneraryRepository;
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Terry
 */
public class ItinerariyRepositoryImpl implements IteneraryRepository{
    private final ArrayList<Itineraries> itineraries;
    
    public ItinerariyRepositoryImpl()

    {
        itineraries = new ArrayList<>();{
        
     
        
        
        }
    

   
         }

    @Override
    public boolean addItinerary(Itineraries itinerary) {
        for (int index = 0; index < itineraries.size(); index++){
            if (itineraries.get(index).getId()== itinerary.getId() )
                return false;
        }
        itineraries.add(itinerary);
        return true;
        
    }

    @Override
    public List<Itineraries> readItinerary() {
       return itineraries;
    }

    @Override
    public Itineraries readItinerary(long id) {
        for (Itineraries itinerary:itineraries){
            
            if (itinerary.getId() ==  id){
                   return itinerary;
            }
        }
        return null; 
    }

    @Override
    public boolean updateItinerary(long itineraryId, BigDecimal newPrice) {
          Itineraries itineraries = readItinerary(itineraryId);
        if( itineraries == null) return false;
        
         itineraries.setBasicPrice(newPrice);
        return true;
    }

   
}






