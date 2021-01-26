package com.bankaccount;

public class Customer {
    private double balance=25;

    public Customer(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        return balance+=amount;
    }
}
