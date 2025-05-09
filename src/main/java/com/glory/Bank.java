package com.glory;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name){
        this.name = name;

    }

    private Customer getCustomer(String customerName){
        for (var customer : customers){
            if (customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit){
        if (getCustomer(customerName) == null){
            Customer newCustomer = new Customer(customerName, initialDeposit);
            customers.add(newCustomer);
            System.out.println("New Customer added: " + customers);

        }
    }
}
