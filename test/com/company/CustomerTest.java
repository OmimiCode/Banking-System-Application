package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
Customer customer;
    @BeforeEach
    void setUp() {
        customer = new Customer();
    }

    @AfterEach
    void tearDown() {
        customer = null;
    }

    @Test
    void testUserCanSetAndGetFirstName_middleName_LastName(){
        customer.setFirstName("paul");
        assertEquals("paul", customer.getFirstName());

        customer.setMiddleName("john");
        assertEquals("john", customer.getMiddleName());

        customer.setLastName("bill");
        assertEquals("bill", customer.getLastName());

    }

}