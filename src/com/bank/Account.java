package com.bank;

public abstract class Account {
    private String accountNumber;
    double accountBalance;

    public Account(String accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    public Account(){
        this("", 0.0);
    }

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

    public void transfer(double amount, Account account){
       withdraw(amount);
       account.deposit(amount);
    }

    public abstract void withdraw(double withdrawalAmount);

}
