package com.company;

public class CurrentAccount extends Account {

    @Override
    public void withdraw(double withdrawalAmount) {
         if(accountBalance>=withdrawalAmount) {
             accountBalance -= withdrawalAmount;
            }else{
             throw new IllegalArgumentException("insufficient funds");
         }
    }
}
