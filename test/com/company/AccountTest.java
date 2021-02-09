//package com.company;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class AccountTest {
//    Account account;
//
//    @BeforeEach
//    void setUp() {
//        account = new Account();
//    }
//
//    @AfterEach
//    void tearDown() {
//        account = null;
//    }
//
//
//    @Test
//    void testThatWeCanSetAndGetAccountNumber() {
//        //given
//        Account account = new Account();
//        //when
//        account.setAccountNumber("sCb001");
//        //assert
//        assertEquals("SCB001", account.getAccountNumber());
//
//        account.setAccountNumber("scb2437");
//        //assert
//        assertEquals("SCB2437", account.getAccountNumber());
//    }
//
//
//    @Test
//    void testThatWeCanSetAndGetAccountBalance() {
//        account.setBalance(98765432.1);
//        assertEquals(98765432.1, account.getBalance());
//        account.setBalance(1000);
//        assertEquals(1000.0, account.getBalance());
//    }
//
//    @Test
//    void testThatWeCanDepositMoneyIntoTheAccount() {
//        account.setBalance(180);
//        account.deposit(100.0);
//        assertEquals(280, account.getBalance());
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//}