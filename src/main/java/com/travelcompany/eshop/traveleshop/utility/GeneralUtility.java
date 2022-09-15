/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop.utility;

import com.travelcompany.eshop.traveleshop.domain.Customers;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Terry
 */
public class GeneralUtility {
    
   
    public static String[] customers = {
        "1, Maria Ioannidou,miordanou@mail.com,Athens,Greek,INDIVIDUAL",
        "2, Dimitriou Dimitrios,ddimitriou@mail.com, Athens,Greek,INDIVIDUAL",
        "3, Ioannis Ioannou,iioannou@mail.com, Athens,Greek,BUSINESS",
        "4, Antonio Molinari,amolinari@mail.com, Milan,Italian,INDIVIDUAL",
        "5, Frederico Rosii,frossi@mail.com, Milan,Italian,INDIVIDUAL",
        "6, Mario Conti,mconti@mail.com, Rome,Italian,BUSINESS",
        "7, Nathan Martin,nmartin@mail.com, Lyon,French,BUSINESS",
        "8, Enzo Collin,ecollin@mail.com, Lyon,French,INDIVIDUAL",
        "9, Frederic Michel,fmichel@mail.com,Athens,French,INDIVIDUAL"
        
      };

public static String[] itineraries = {
    
    "1,DEPARTURECODE,PAR,22/02/2022 13:35,AIRLINE,300",
    "2,DEPARTURECODE,LON,22/02/2022 13:40,AIRLINE,420",
    "3,DEPARTURECODE,AMS,22/02/2022 13:45,AIRLINE,280",
    "4,DEPARTURECODE,PAR,22/02/2022 14:20,AIRLINE,310",
    "5,DEPARTURECODE,DUB,22/02/2022 14:35,AIRLINE,880",
    "6,DEPARTURECODE,FRA,22/02/2022 14:55,AIRLINE,380",
    "7,DEPARTURECODE,FRA,22/02/2022 15:35,AIRLINE,350",
    "8,DEPARTURECODE,MEX,22/02/2022 16:00,AIRLINE,1020",
    "9,DEPARTURECODE,DUB,22/02/2022 16:35,AIRLINE,770",
    
    };

     public static boolean isValidEmail(String email){
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
       public static boolean isValidcustomer(Customers customer){
        if (customer == null) return false;    
        
  //      if ("administrator".equals(customer.getFirstName())) return false;
        if (customer.getFullName()!=null && customer.getFullName().toLowerCase().equals("administrator")) return false;
        if (! isValidEmail(customer.getEmail())) return false;
        if (customer.getEmail().contains("@gmail.com")) return false;
        
        return true;
      }

    public static void parseOrder(String myOrderAsSting) {
        String[] words = myOrderAsSting.split(",");
        System.out.println("The details of the order are:");
        for (String word : words) {
            System.out.println(word);
        }
    }
      

}

