package com.glory;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name){
        this.name = name;

    }


    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
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
            System.out.println("New Customer added: " + newCustomer);

        }
    }

    public void addTransaction(String name, double transactionAmount){
        Customer newCustomer = getCustomer(name);
        if (newCustomer != null){
           newCustomer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName){
        Customer newCustomer = getCustomer(customerName);
        if (newCustomer == null){
            return;
        }

        System.out.println("_" .repeat(30));
        System.out.println("Customer Name: " + newCustomer.name());
        System.out.println("Transactions:");

        for (double d : newCustomer.transactions()){ // using unboxing here
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");

        }
    }
}
