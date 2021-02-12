package com.bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
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
        account.setAccountNumber("SCB001");
        //assert
        assertEquals("SCB001", account.getAccountNumber());

        account.setAccountNumber("SCB2437");
        //assert
        assertEquals("SCB2437", account.getAccountNumber());
    }

    @Test
    void accountCanGenerateRandomAccountNumberUponCreation() {
        Account account1 = new Account() {
            @Override
            public void withdraw(double withdrawalAmount) {

            }
        };
        Account account2 = new Account() {
            @Override
            public void withdraw(double withdrawalAmount) {

            }
        };
//        account1.generateAccountNumber();
        String accNumber1 = account1.getAccountNumber();
        System.out.println("ACCOUNT NUMBER 1: " + accNumber1);
        assertEquals(accNumber1, account1.getAccountNumber());

//        account2.generateAccountNumber();
        String accNumber2 = account2.getAccountNumber();
        System.out.println("ACCOUNT NUMBER 2: " + accNumber2);
        assertEquals(accNumber2, account2.getAccountNumber());

        System.out.printf("account number 1:%s%n  account number 2:%s%n", accNumber1, accNumber2);
        assertNotEquals(accNumber1, accNumber2);

        Account autoAccount = new Account() {
            @Override
            public void withdraw(double withdrawalAmount) {

            }
        };

        System.out.println("AUTO-ACCOUNT NUMBER GENERATION : " + autoAccount.getAccountNumber());

        Account account3 = new SavingsAccount();
        String accNumber3 = account3.getAccountNumber();
        System.out.println("ACCOUNT NUMBER 3: " + accNumber3);


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
    void testAccountCanTransferMoneyFromOneAccountToTheOther() {
        Account account1 = new SavingsAccount();
        Account account2 = new SavingsAccount();
        Account account3 = new SavingsAccount();
        Account account4 = new CurrentAccount();

        account1.deposit(100);
        assertEquals(100, account1.getBalance());
        account2.deposit(20);
        assertEquals(20, account2.getBalance());

        account1.transfer(30, account2);
        assertEquals(50, account2.getBalance());
        assertEquals(70, account1.getBalance());

//        account3.generateAccountNumber();
        System.out.println(account3.getAccountNumber());
        account3.deposit(2000000);
        assertEquals(2000000, account3.getBalance());
        assertThrows(IllegalArgumentException.class, () -> account3.transfer(1500000, account1));
        assertThrows(IllegalArgumentException.class, () -> account3.transfer(2500000, account1));


        System.out.println("ACCOUNT NUMBER 4 : " + account4.getAccountNumber());
        account4.deposit(2000000);
        assertEquals(2000000, account4.getBalance());
        assertThrows(IllegalArgumentException.class, () -> account4.transfer(2500000, account1));

        Account account = new Account() {
            @Override
            public void withdraw(double withdrawalAmount) {
                if (accountBalance >= withdrawalAmount) {
                    accountBalance -= withdrawalAmount;
                } else {
                    throw new IllegalArgumentException("insufficient funds");
                }
            }
        };

   assertThrows(IllegalArgumentException.class, () -> account.transfer(100, account4));
   account.setBalance(230);
   assertEquals(230,account.getBalance());
   account.transfer(100, account4);
   assertEquals(130, account.getBalance());
   assertEquals(2000100, account4.getBalance());
    }


    @Test
    void testTheTellerInterfaceImplementationDetailsSuchAsTheToStringMethod(){

        Person customer = new Customer();
        customer.setFirstName("John");
        customer.setMiddleName("pete");
        customer.setLastName("bill");
        customer.setAge(1996);
        customer.setGender("male");
        customer.setAddress("17","ekujumi street sari-iganmu","lagos", "nigeria");
        customer.account = new SavingsAccount();


        System.out.println(customer.toString());


    }
}






