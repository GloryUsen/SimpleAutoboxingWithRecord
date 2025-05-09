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

        Customer glo = new Customer("Glo cus", 1000.0);
        System.out.println(glo);





    }
}