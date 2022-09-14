/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop.repository;

import com.travelcompany.eshop.traveleshop.domain.Itineraries;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Terry
 */
public interface  IteneraryRepository {
     boolean addItinerary (Itineraries itinerary);
    List<Itineraries> readItinerary();
    Itineraries readItinerary(long itineraryId);
    boolean updateItinerary(long itineraryId,BigDecimal newPrice);
    
    
    
}
