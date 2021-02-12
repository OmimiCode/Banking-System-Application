package com.bank;

import java.security.SecureRandom;

public abstract class Account implements Teller {
    private String accountNumber;
    double accountBalance;

    public Account(String accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public Account(){
        generateAccountNumber();
        this.accountBalance = 0.0;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() { return accountNumber;}

    public void setBalance(double accountBalance) { this.accountBalance = accountBalance;}

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

    public void generateAccountNumber(){
        SecureRandom randomNumber = new SecureRandom();
        int number = 10000 + randomNumber.nextInt(99999);
        String bankSignature = "SCB";
        this.accountNumber = bankSignature + number;
    }



    @Override
    public String displayAccountDetails() {
        return String.format( "ACCOUNT NUMBER: %s%n ACCOUNT BALANCE: %s%n", getAccountNumber(), getBalance());
    }

    @Override
    public String DisplayTransactionDetails() {
        return null;
    }
}
