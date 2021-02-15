package com.bank;

public class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double accountBalance, int pin ) {
        super(accountNumber,accountBalance,pin);
    }

    public CurrentAccount() {
    super();
    }

    @Override
    public void withdraw(double withdrawalAmount) {
         if(accountBalance>=withdrawalAmount) {
             accountBalance -= withdrawalAmount;
            }else{
             throw new IllegalArgumentException("insufficient funds");
         }
    }

    @Override
    public void debit(double debitAmount) {
        if(accountBalance>=debitAmount) {
            accountBalance -= debitAmount;
        }else{
            throw new IllegalArgumentException("insufficient funds");
        }
    }
}
