package com.bankaccount;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private boolean locked;
    private double balance=25;
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    List<String> bankStatement= new ArrayList<>();

    public Customer(){}
    public Customer(double balance) {
        this.balance = balance;
    }

    public Customer(String name, String phoneNumber, String email, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.locked = false;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        bankStatement.add("Amount deposited " + amount);
        return balance+=amount;
    }

    public Response withdraw(double amount) {
        if(amount > this.balance) {
            return new Response("You don't have enough money to do this transaction",this.balance);
        }
        bankStatement.add("Amount withdrawn " + amount);
        balance -= amount;
        if(this.balance<30){
            return new Response("Your balance reached below $30",this.balance);
        }
        else {
            return new Response(this.balance);
        }
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public List<String> displayAllTheTransactions() {
        return bankStatement;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
