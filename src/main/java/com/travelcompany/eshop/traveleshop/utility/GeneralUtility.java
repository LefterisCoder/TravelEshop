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
        "1,Maria Ioannidou,miordanou@mail.com,Athens,Greek,INDIVIDUAL",
        "2,Dimitriou Dimitrios,ddimitriou@mail.com,Athens,Greek,INDIVIDUAL",
        "3,Ioannis Ioannou,iioannou@mail.com,Athens,Greek,BUSINESS",
       "4,Antonio Molinari,amolinari@mail.com,Milan,Italian,INDIVIDUAL",
        "5,Frederico Rosii,frossi@mail.com,Milan,Italian,INDIVIDUAL",
        "6,Mario Conti,mconti@mail.com,Rome,Italian,BUSINESS",
        "7,Nathan Martin,nmartin@mail.com,Lyon,French,BUSINESS",
        "8,Enzo Collin,ecollin@mail.com,Lyon,French,INDIVIDUAL",
        "9,Frederic Michel,fmichel@mail.com,Athens,French,INDIVIDUAL"

        
      };

public static String[] itineraries = {
    
    "1,DEPARTURECODE,PAR,22/02/202213:35,Skylines,300",
    "2,DEPARTURECODE,LON,22/02/202213:40,Skylines,420",
    "3,DEPARTURECODE,AMS,22/02/202213:45,Skylines,280",
    "4,DEPARTURECODE,PAR,22/02/202214:20,Skylines,310",
    "5,DEPARTURECODE,DUB,22/02/202214:35,Skylines,880",
    "6,DEPARTURECODE,FRA,22/02/202214:55,Skylines,380",
    "7,DEPARTURECODE,FRA,22/02/202215:35,Skylines,350",
    "8,DEPARTURECODE,MEX,22/02/202216:00,Skylines,1020",
    "9,DEPARTURECODE,DUB,22/02/202216:35,Skylines,770",
    
    };

     public static boolean isValidEmail(String email){
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
       public static boolean isValidcustomer(Customers customer){
        if (customer == null) return false;    
        
 
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
//
//        "1,Maria Ioannidou,miordanou@mail.com,Athens,Greek,INDIVIDUAL",
//        "2,Dimitriou Dimitrios,ddimitriou@mail.com,Athens,Greek,INDIVIDUAL",
//        "3,Ioannis Ioannou,iioannou@mail.com,Athens,Greek,BUSINESS",
//        "4,Antonio Molinari,amolinari@mail.com,Milan,Italian,INDIVIDUAL",
//        "5,Frederico Rosii,frossi@mail.com,Milan,Italian,INDIVIDUAL",
//        "6,Mario Conti,mconti@mail.com,Rome,Italian,BUSINESS",
//        "7,Nathan Martin,nmartin@mail.com,Lyon,French,BUSINESS",
//        "8,Enzo Collin,ecollin@mail.com,Lyon,French,INDIVIDUAL",
//        "9,Frederic Michel,fmichel@mail.com,Athens,French,INDIVIDUAL"
//        