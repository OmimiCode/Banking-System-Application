package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrentAccountTest {
CurrentAccount currentAccount;
    @BeforeEach
    void setUp() {
        currentAccount = new CurrentAccount();
    }

    @AfterEach
    void tearDown() {
        currentAccount = null;
    }


    @Test
    void testThatWeCanWithdrawUnlimitedAmountFromACurrentAccountGivenThatCurrentBalanceIsGreaterThanWithdrawalAmount(){
        currentAccount.setBalance(100.0);


        currentAccount.withdraw(80);
        assertEquals(20,currentAccount.getBalance());


        assertThrows(IllegalArgumentException.class, ()-> currentAccount.withdraw(30));

    }
}