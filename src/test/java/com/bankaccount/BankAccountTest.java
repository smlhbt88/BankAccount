package com.bankaccount;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

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

    /**
     * Given that I am a customer
     * When I withdraw an amount from my account
     * Then I expect my balance in my account to decrease with that amount.
     */
    @Test
    public void withdraw() {
        customer.deposit(75.00);
        assertEquals(50.00 ,customer.withdraw(50.00).getAmount(),0.1);
    }
    /**
     * Given that I am a customer
     * When I withdraw an amount from my account with the minimum balance.
     * Then I expect to see a notification "You don't have enough money to do this transaction".
     */
    @Test
    public void withdrawWithMinimunBalance() {
        assertEquals("You don't have enough money to do this transaction",customer.withdraw(27.00).getMessage());
    }
    /**
     * Given that I am a customer
     * When I want to withdraw and my balance reaches below $30
     * Then I expect to receive an alert saying "Your balance reached below $30".
     */
    @Test
    public void withdrawBalanceReachesBelow$30() {
        customer.deposit(75);
        assertEquals("Your balance reached below $30",customer.withdraw(71).getMessage());
    }

    /**
     * Given that I am a customer
     * When I update my profile information (Name, Phone Number, Email address, Address).
     * Then I expect to see the updated information.
     */
    @Test
    public void createACustomerProfile() {
        customer = new Customer("Daniel","123-4569","s@gmail.com","646 chicago ave.");
        assertEquals("Daniel",customer.getName());
        assertEquals("123-4569",customer.getPhoneNumber());
        assertEquals("s@gmail.com",customer.getEmail());
        assertEquals("646 chicago ave.",customer.getAddress());
    }

    /**
     * Given that I am a customer
     * When I check me previous transactions,
     * Then I expect to see all of the transactions
     */
    @Test
    public void displayTransactions() {
        customer = new Customer();
        customer.deposit(50);
        customer.deposit(500);
        customer.withdraw(200);
        customer.withdraw(10);
        customer.withdraw(80);
        customer.deposit(150);
        customer.displayAllTheTransactions();
        assertEquals("Amount deposited 50.0",customer.displayAllTheTransactions().get(0) );
        assertEquals("Amount deposited 500.0",customer.displayAllTheTransactions().get(1) );
        assertEquals("Amount withdrawn 200.0",customer.displayAllTheTransactions().get(2) );
        assertEquals("Amount withdrawn 10.0",customer.displayAllTheTransactions().get(3) );
        assertEquals("Amount withdrawn 80.0",customer.displayAllTheTransactions().get(4) );
        assertEquals("Amount deposited 150.0",customer.displayAllTheTransactions().get(5) );
    }
    /**
     * Given that I am a banker
     * When I access a customer's profile information (Name, Phone Number, Email address, Address),
     * Then I expect to see customer's profile information.
     */
    @Test
    public void checkCustomerProfileByBanker() {
        customer = new Customer("Daniel","123-4569","s@gmail.com","646 chicago ave.");
        assertEquals("Daniel",customer.getName());
        assertEquals("123-4569",customer.getPhoneNumber());
        assertEquals("s@gmail.com",customer.getEmail());
        assertEquals("646 chicago ave.",customer.getAddress());
    }

    /**
     * Given that I am a banker
     * When a customer requests to unlock his account,
     * Then I expect to be able to unlock his account.
     */
    @Test
    public void unlockCustomerAccount() {
        Banker banker = new Banker();
        customer = new Customer("Daniel","123-4569","s@gmail.com","646 chicago ave.");
        banker.lockAccount(customer);
        String message = banker.unlockAccount(customer);
        assertEquals("account unlocked",message);
    }

    /**
     * Given that I am a banker
     * When a customer requests information on the transactions,
     * Then I expect to be able to access all his past transactions.
     */
    @Test
    public void showAllPastTransactions() {
        customer = new Customer("Daniel","123-4569","s@gmail.com","646 chicago ave.");
        customer.deposit(50);
        customer.deposit(500);
        customer.withdraw(200);
        customer.withdraw(10);
        customer.withdraw(80);
        customer.deposit(150);
        customer.displayAllTheTransactions();
        assertEquals("Daniel,123-4569,s@gmail.com,646 chicago ave.",customer.displayAllTheTransactions().get(0) );
        assertEquals("Amount deposited 50.0",customer.displayAllTheTransactions().get(1) );
        assertEquals("Amount deposited 500.0",customer.displayAllTheTransactions().get(2) );
        assertEquals("Amount withdrawn 200.0",customer.displayAllTheTransactions().get(3) );
        assertEquals("Amount withdrawn 10.0",customer.displayAllTheTransactions().get(4) );
        assertEquals("Amount withdrawn 80.0",customer.displayAllTheTransactions().get(5) );
        assertEquals("Amount deposited 150.0",customer.displayAllTheTransactions().get(6) );
    }

    /**
     * Given that a charge will be applied to a customer's account because of no transactions in the last two months.
     * When a customer requests the charge to be reverted in his account,
     * Then I expect to be able to revert the charge applied to his account.
     */
//    @Test
//    public void revertTransaction() {
//        customer = new Customer("Daniel","123-4569","s@gmail.com","646 chicago ave.");
//        customer.setTransactionDate();
//        boolean v = customer.checkNoTransactionDateIfPassedTwoMonths();
//        customer.applyCharge();
//        if(v) {
//            customer.revertCharge();
//        }
//
//        //assertEquals(,customer.revertCharge());
//
//    }






}
