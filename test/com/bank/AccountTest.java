package com.bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest<Account1> {
    Account account;

    @BeforeEach
    void setUp() {
        account = new Account() {
            @Override
            public void withdraw(double withdrawalAmount) {

            }
        };
    }

    @AfterEach
    void tearDown() {
        account = null;
    }


    @Test
    void testThatWeCanSetAndGetAccountNumber() {
        //given
        Account account = new Account() {
            @Override
            public void withdraw(double withdrawalAmount) {

            }
        };
        //when
        account.setAccountNumber("sCb001");
        //assert
        assertEquals("SCB001", account.getAccountNumber());

        account.setAccountNumber("scb2437");
        //assert
        assertEquals("SCB2437", account.getAccountNumber());
    }


    @Test
    void testThatWeCanSetAndGetAccountBalance() {
        account.setBalance(98765432.1);
        assertEquals(98765432.1, account.getBalance());
        account.setBalance(1000);
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    void testThatWeCanDepositMoneyIntoTheAccount() {
        account.setBalance(180);
        account.deposit(100.0);
        assertEquals(280, account.getBalance());
    }



    @Test
    void testAccountCanTransferMoneyFromOneAccountToTheOther(){
        Account account1 = new SavingsAccount(); account1.setBalance(100);
        Account account2 = new SavingsAccount(); account2.setBalance(0.0);
        account1.transfer(70.0, account2);
        assertEquals(30,account1.getBalance());
        assertEquals(70,account2.getBalance());
    }












}