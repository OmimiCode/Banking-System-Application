package com.bank;

import java.time.Year;

public class Person {
    protected Account account;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String dateOfBirth;
    private int age;
    private String address = "";

    public Person(String firstName, String middleName, String lastName, String gender, String dateOfBirth, int age, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName.toUpperCase();
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName.toUpperCase();
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender() {
        return gender.toUpperCase();
    }

    public void setDateOfBirth(int dd, int mm, int yy) {
        this.dateOfBirth = String.format("%d/%d/%d", dd,mm,yy);
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setAge(int yearOfBirth) {
        this.age = Year.now().getValue()-yearOfBirth;
    }


    public int getAge() {
        return age;
    }

    public void setAddress(String blockNumber, String street_Avenue, String state, String country) {
        this.address +=  blockNumber+", "+street_Avenue+", "+state+", "+country;
    }

    public String getAddress() {
        return address.toUpperCase();
    }
}
