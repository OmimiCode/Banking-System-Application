package com.bank;
public class Customer extends Person{

    public Customer(String firstName, String middleName, String lastName, String gender, String dateOfBirth, int age, String address, Account account) {
        super(firstName, middleName, lastName, gender, dateOfBirth, age, address);
        this.account = account;
     }
     public Customer(){}

    @Override
    public String toString(){
        return String.format(" FIRST NAME: %s%n MIDDLE NAME: %s%n LAST NAME: %s%n GENDER: %s%n AGE: %d%n ADDRESS: %s%n DATE OF BIRTH: %s%n ACCOUNT NUMBER: %s%n ACCOUNT BALANCE: %s%n",
                getFirstName(), getMiddleName(), getLastName(), getGender(), getAge(), getAddress(), getDateOfBirth(),  account.getAccountNumber(), account.getBalance(), account.displayAccountDetails(), account.DisplayTransactionDetails());
    }
}
