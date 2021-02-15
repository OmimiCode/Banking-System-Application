package com.bank;

import javax.swing.*;
import java.security.SecureRandom;
import java.util.Scanner;


public abstract class Account implements Teller {

    private String accountNumber;
    double accountBalance;
    private int pin;

    public Account(String accountNumber, double accountBalance, int pin) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        if(pin > 999 && pin <= 9999) {
            this.pin = pin;
        }else{
            throw new IllegalArgumentException("pin must be 4-digit");
        }
     }


    public Account(){
        generateAccountNumber();
        setPin();
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

    public void transfer(double amount, Account account) {
        int pin = Integer.parseInt(JOptionPane.showInputDialog("enter your 4-digit pin to transfer"));
        if (pin == getPin()) {
            debit(amount);
            account.credit(amount);
            System.out.println("transfer " + Status.successful);
        } else {
            throw new IllegalArgumentException("invalid pin, " + "transfer " + Status.unsuccessful);
        }
    }


    public abstract void withdraw(double withdrawalAmount);

    public void generateAccountNumber(){
        SecureRandom randomNumber = new SecureRandom();
        int number = 10000 + randomNumber.nextInt(99999);
        String bankSignature = "SCB";
        this.accountNumber = bankSignature + number;
    }

    public abstract void debit(double debitAmount);


    public void credit(double creditAmount){
        this.accountBalance+=creditAmount;
    }


    @Override
    public String displayAccountDetails() {
        return String.format( "ACCOUNT NUMBER: %s%n ACCOUNT BALANCE: %s%n", getAccountNumber(), getBalance());
    }

    @Override
    public String DisplayTransactionDetails() {
        return null;
    }

    public void setPin(){
        int pin = Integer.parseInt(JOptionPane.showInputDialog("set pin for " + getAccountNumber()));
        if(pin > 999 && pin <= 9999) {
            this.pin = pin;
        }else{
            throw new IllegalArgumentException("pin must be 4-digit");
        }
    }

    public int getPin(){
        return pin;
    }
}
