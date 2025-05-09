package com.glory;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){ // Using record not class for the customer.

    public Customer(String name, double initialDeposit){
        this(name.toUpperCase(),
                new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }

}


public class Main {
    public static void main(String[] args) {

        Customer glo = new Customer("gloria", 1000.0);
        System.out.println(glo);

        // Creating a new bank and adding a new customer



        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Glory U", 500.0);
        System.out.println(bank); //printing the bank object

        System.out.println("--------------");

        bank.addTransaction("Glory U", -10.25);
        bank.addTransaction("glory U", -75.01);
        bank.printStatement("Glory u");





    }
}