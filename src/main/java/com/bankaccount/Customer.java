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

    public Response withdraw(double amount) {
        if(amount > this.balance) {
            return new Response("You don't have enough money to do this transaction",this.balance);
        } else {
            balance -= amount;
            return new Response(this.balance);
        }
    }

}
