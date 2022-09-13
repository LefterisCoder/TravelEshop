/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.traveleshop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Terry
 */
public class CustomerBook {

    private ArrayList<Customers> customers;

    public CustomerBook() throws FileNotFoundException {
        customers = new ArrayList<Customers>();
//        File file = new File("CustomerBook.csv");
//        PrintWriter pw = new PrintWriter(file);
//        pw.print(customers.addAll(customers));
//        pw.close();
        customers.add(new Customers(1, "Maria Ioannidou", "miordanou@mail.com", "Athens", "Greek", Category.INDIVIDUAL));
        customers.add(new Customers(2, "Dimitriou Dimitrios", "ddimitriou@mail.com", "Athens", "Greek", Category.INDIVIDUAL));
        customers.add(new Customers(3, "Ioannis Ioannou", "iioannou@mail.com", "Athens", "Greek", Category.BUSINESS));
        customers.add(new Customers(4, "Antonio Molinari", "amolinari@mail.com", "Milan", "Italian", Category.INDIVIDUAL));
        customers.add(new Customers(5, "Frederico Rosii", "frossi@mail.com", "Milan", "Italian", Category.INDIVIDUAL));
        customers.add(new Customers(6, "Mario Conti", "mconti@mail.com", "Rome", "Italian", Category.BUSINESS));
        customers.add(new Customers(7, "Nathan Martin", "nmartin@mail.com", "Lyon", "French", Category.BUSINESS));
        customers.add(new Customers(8, "Enzo Collin", "ecollin@mail.com", "Lyon", "French", Category.INDIVIDUAL));
        customers.add(new Customers(9, "Frederic Michel", "fmichel@mail.com", "Athens", "French", Category.INDIVIDUAL));

    }

    public void getCategory() {
        for (int i = 0; i < customers.size(); i++) {
            if (Category.INDIVIDUAL.equals(customers.get(i).getCategory())) {

                System.out.println("True");

            } else {
                System.out.println("false");
            }

        }

    }

    @Override
    public String toString() {
        return "CustomerBook{" + "customers=" + customers + "\n";

    }

    public ArrayList<Customers> getCustomers() {
        return this.customers;
    }

    public CustomerBook(ArrayList<Customers> customers) {
        this.customers = customers;
    }

    public void addNewCust(Customers newCust) {
        customers.add(newCust);
    }

    public void printAllCustomers() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }
}
