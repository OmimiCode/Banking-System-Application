package com.bank;

public class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double accountBalance) {
        super(accountNumber, accountBalance);
    }

    @Override
    public void withdraw(double withdrawalAmount) {
         if(accountBalance>=withdrawalAmount) {
             accountBalance -= withdrawalAmount;
            }else{
             throw new IllegalArgumentException("insufficient funds");
         }
    }
}
