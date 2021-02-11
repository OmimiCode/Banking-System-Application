package com.bank;

public class SavingsAccount extends Account{
public static final double savingsAccountWithdrawalLimit = 1000000;

    public SavingsAccount(String accountNumber, double accountBalance) {
        super(accountNumber, accountBalance);
    }
    public SavingsAccount (){
        super();
    }

    @Override
    public void withdraw(double withdrawalAmount) {
        if(accountBalance>=withdrawalAmount ) {
            accountBalance -= withdrawalAmount;
        }else{
            throw new IllegalArgumentException("insufficient funds");
        }
        if( withdrawalAmount<=savingsAccountWithdrawalLimit){
            accountBalance -= withdrawalAmount;
        }else{
            throw new IllegalArgumentException("Your account is a savings account, we are sorry you have a daily withdrawal limit of N1_000_000 and You've exceeded your withdrawal limit for today , please try again");
        }
    }
}
