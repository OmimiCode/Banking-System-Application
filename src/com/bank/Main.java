package com.bank;

public class Main
{
    public static void main(String[] args) {
        Account account = new SavingsAccount();
        Customer newCustomer = new Customer("","","","","",1,"", account);
    }
}
