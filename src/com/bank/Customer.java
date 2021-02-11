package com.bank;
public class Customer extends Person{

    public Customer(String firstName, String middleName, String lastName, String gender, String dateOfBirth, int age, String address, Account account) {
        super(firstName, middleName, lastName, gender, dateOfBirth, age, address);
        this.account = account;
     }
     public Customer(){}

}
