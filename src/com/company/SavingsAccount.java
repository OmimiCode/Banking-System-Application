package com.company;

public class SavingsAccount extends Account{


    @Override
    public void withdraw(double withdrawalAmount) {
        if(accountBalance>=withdrawalAmount) {
            accountBalance -= withdrawalAmount;
        }else{
            throw new IllegalArgumentException("insufficient funds");
        }
    }
}
