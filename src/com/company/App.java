package com.company;

import com.bank.Account;
import com.bank.CurrentAccount;
import com.bank.SavingsAccount;

public class App {
    public static void main(String[] args) {

        SavingsAccount savingsAccount1 = new SavingsAccount();
        SavingsAccount savingsAccount2 = new SavingsAccount();
        CurrentAccount currentAccount1 = new CurrentAccount();
        CurrentAccount currentAccount2 = new CurrentAccount();



        Account[] accountType = new Account[4];
        accountType[0] = savingsAccount1;
        accountType[1] = savingsAccount2;
        accountType[2] = currentAccount1;
        accountType[3] = currentAccount2;

        for (Account accounts : accountType) {
        }


    }
}
