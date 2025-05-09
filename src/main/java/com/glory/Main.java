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

        Customer gloria = new Customer("Gloria S", 1000.0);
        System.out.println(gloria);

        // Creating a new bank and adding a new customer



        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Glory U", 500.0);
        bank.addNewCustomer("Gloria S", 1000.0);
        System.out.println(bank); //printing the bank object

        System.out.println("--------------");

        bank.addTransaction("Glory U", -10.25);
        bank.addTransaction("glory U", -75.01);
        bank.printStatement("Glory u");

        // Customer wasn't added here
//        bank.addTransaction("gloria", 100);
//        bank.printStatement("gloria");

        // Adding gloria as a new customer
        System.out.println("-------------------");
        bank.addTransaction("gloria s", 25);
        bank.addTransaction("Gloria S", 100);
        bank.printStatement("Gloria S");






    }
}