package com.company;

import org.junit.jupiter.api.function.Executable;

public abstract class Account {

    private String accountNumber;
   double accountBalance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber.toUpperCase();
    }

    public void setBalance(double accountBalance) {
       this.accountBalance = accountBalance;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void deposit(double depositAmount) {
    this.accountBalance+=depositAmount;
    }

    public abstract void withdraw(double withdrawalAmount);

}
