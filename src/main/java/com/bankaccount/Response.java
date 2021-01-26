package com.bankaccount;

public class Response {

    private String message;
    private double amount;

    public Response(String message, double amount) {
        this.message =message;
        this.amount=amount;
    }

    public Response(double amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public double getAmount() {
        return amount;
    }
}
