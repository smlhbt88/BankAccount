Banking account
-------------------------

1) As a customer, I want to open an account with the minumum balance of $25.

Given that I am a new customer.
When I have my new account created
Then I expect my account balance to be $25.

2) As a customer, I can deposit money to my account.

Given that I am a customer
When I deposit an amount in my account
Then I expect my balance in my account to increase with that amount.

3) As a customer, I can withdraw money from my account.

Given that I am a customer
When I withdraw an amount from my account
Then I expect my balance in my account to decrease with that amount.

4) As a customer, I am not allowed to withdraw money from my account with minimum balance.

Given that I am a customer
When I withdraw an amount from my account with the minimum balance.
Then I expect to see a notification "You don't have enough money to do this transaction".

5) As a customer, I want to receive alert when balance reaches below $30.

Given that I am a customer
When I want to withdraw and my balance reaches below $30
Then I expect to receive an alert saying "Your balance reached below $30".

6) As a customer, I can update my profile information.

Given that I am a customer
When I update my profile information (Name, Phone Number, Email address, Address).
Then I expect to see the updated information.

7) As a customer, I can see my past transactions.

Given that I am a customer
When I check me previous transactions,
Then I expect to see all of the transactions

8) As a banker, I access customer's bank account.

Given that I am a banker
When I access a customer's profile information (Name, Phone Number, Email address, Address),
Then I expect to see customer's profile information.

9) As a banker, I can unlock customer's account.

Given that I am a banker
When a customer requests to unlock his account,
Then I expect to be able to unlock his account.

10) As a banker, I can access customer's transactions.

Given that I am a banker
When a customer requests information on the transactions,
Then I expect to be able to access all his past transactions.

11) As a banker, I will be able to revert the charges applied on the customer's account.

Given that a charge will be applied to a customer's account because of no transactions in the last two months.
When a customer requests the charge to be reverted in his account,
Then I expect to be able to revert the charge applied to his account.

12) As a banker, I can lock Customer's account.

Given that I am a banker, 
When a customer reports lost of card,
Then I expect to be able to lock his account.

13) As a banker, I can pay back in case of a fraudulent transaction.

Given that I am a banker,
When a customer opens a dispute on a transaction,
Then I expect to be able to pay back to customer's account that amount.

14) As a banker, I can lock the account when the transactions happens in another country other than default country ("US").

Given that I am a banker,
When a transaction happens on customer's account in another other than default country ("US"),
Then I expect to be able to lock the account.
 