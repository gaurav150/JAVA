package com.challenge;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transaction) {

    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase()
                , new ArrayList<Double>(500));
        transaction.add(initialDeposit);

    }

}

public class AutoBoxingChallenge {

    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 1000.0d);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jane A", 450.00d);
        System.out.println(bank);

        bank.addTransaction("Jane A", -10.25);
        bank.addTransaction("Jane A", 4.50);
        bank.addNewCustomer("Earl", 25.0);
        bank.addTransaction("Earl", 89.90);
        bank.addTransaction("Jane A", -56.02);
        bank.addTransaction("Earl", -34.87);
        bank.printStatement("Jane A");
        bank.printStatement("Earl");


    }
}

class Bank {
    private final String name;
    private final ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName) {
        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);

        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {

        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.printf("New Customer Added %s %n", customer);

        }

    }

    public void addTransaction(String name, double transactionAmount) {
        Customer customer = getCustomer(name);
        if (customer != null) {
            customer.transaction().add(transactionAmount);

        }
    }

    public void printStatement(String customerName) {
        Customer customer = getCustomer(customerName);
        if (customer == null) {
            return;
        }

        System.out.println("_".repeat(30));
        System.out.println("Customer Name : " + customer.name());
        System.out.println("Transactions : ");
        for (double d : customer.transaction()) { // unboxing
            System.out.printf("$%10.2f (%s) %n", d, d < 0 ? "debit" : "credit");

        }
    }
}
