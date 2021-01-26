package com.bankaccount;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {
    Customer customer = new Customer(25);

    /**
     * Given that I am a new customer.
     * When I have my new account created
     * Then I expect my account balance to be $25.
     */
    @Test
    public void createAnAccountWithBalance25() {
        assertEquals(25, customer.getBalance(),0.1);
    }

    /**
     * Given that I am a customer
     * When I deposit an amount in my account
     * Then I expect my balance in my account to increase with that amount.
     */
    @Test
    public void depositInMyAccount() {
        assertEquals(125.00 ,customer.deposit(100.00),0.1);
    }
}
