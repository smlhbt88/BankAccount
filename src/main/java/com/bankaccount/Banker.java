package com.bankaccount;

public class Banker {

    public String unlockAccount(Customer customer) {
        customer.setLocked(false);
        return "account unlocked";
    }

    public void lockAccount(Customer customer) {
        customer.setLocked(true);
    }
}
