package com.bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {


    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {


    }



    @Test
    void ThatWeCanCreateANewCustomerWIthCurrentAccount(){
        Account samCurrentAccount = new CurrentAccount("SCB1234",0.0);
        Customer samuel = new Customer("","", "","","", 0, "", samCurrentAccount );
        samuel.setFirstName("samuel");
        samuel.setMiddleName("john");
        samuel.setLastName("paul");
        samuel.account = samCurrentAccount;
        samuel.setGender("MALE");
        samuel.setDateOfBirth(12,4,1996);
        samuel.setAddress("17b","herbert street","lagos", "nigeria" );

        assertEquals("SAMUEL", samuel.getFirstName());
        assertEquals("JOHN", samuel.getMiddleName());
        assertEquals("PAUL", samuel.getLastName());
        assertEquals("MALE", samuel.getGender());
        assertEquals("12/4/1996", samuel.getDateOfBirth());
        samuel.setAge(1996);
        assertEquals(25,samuel.getAge());
        assertEquals("17B, HERBERT STREET, LAGOS, NIGERIA", samuel.getAddress());
        assertEquals("SCB1234",samuel.account.getAccountNumber());
        assertEquals(0.0,samuel.account.getBalance());
        samuel.account.deposit(150);
        assertEquals(150, samuel.account.getBalance());
        samuel.account.withdraw(150);
        assertEquals(0,samuel.account.getBalance());
    }

    @Test
    void ThatWeCanCreateANewCustomerWIthSavingsAccount(){
        Account savingsAccount1 = new SavingsAccount("SCB1111", 0.0);
        Customer shola = new Customer("","", "","","", 0, "", savingsAccount1);
        shola.account.setAccountNumber("SCB111");
        assertEquals(0, shola.account.getBalance());
        shola.account.deposit(1000);
        assertEquals(1000, shola.account.getBalance());
        shola.account.deposit(1000000);
//        shola.account.withdraw(1000050);
//        assertEquals(950, shola.account.getBalance());
        assertThrows(IllegalArgumentException.class, ()-> shola.account.withdraw(1000050));

    }

}