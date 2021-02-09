package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {
SavingsAccount savingsAccount;
    @BeforeEach
    void setUp(){
        savingsAccount = new SavingsAccount();
    }

    @AfterEach
    void tearDown() {
    savingsAccount = null;
    }



    @Test
    void testThatWeCanWithdrawUnlimitedAmountFromAsavingsAccountGivenThatCurrentBalanceIsGreaterThanWithdrawalAmount(){
      savingsAccount.setBalance(100.0);


        savingsAccount.withdraw(80);
        assertEquals(20,savingsAccount.getBalance());


        assertThrows(IllegalArgumentException.class, ()-> savingsAccount.withdraw(30));
    }
}