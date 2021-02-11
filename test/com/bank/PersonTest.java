package com.bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
Person person;
    @BeforeEach
    void setUp() {
        person = new Person("paul", "john","bill", "male","12/7/1996", 25,"172, washington Avenue, Washington DC, USA" );
    }

    @AfterEach
    void tearDown() {
        person = null;
    }

    @Test
    void testUserCanSetAndGetFirstName_middleName_LastName(){
//        person.setFirstName("paul");
        assertEquals("PAUL", person.getFirstName());

//        person.setMiddleName("john");
        assertEquals("JOHN", person.getMiddleName());

//        person.setLastName("bill");
        assertEquals("BILL", person.getLastName());

    }


    @Test
    void testUserCanSetAndGetGender(){
//        person.setGender("Male");
        assertEquals("MALE", person.getGender());

    }

    @Test
    void testUserCanSetAndGetDate(){
        person.setDateOfBirth(12, 7, 1996);
        assertEquals("12/7/1996", person.getDateOfBirth());
    }

    @Test
    void testUserCanSetAndGetAge(){
        person.setAge(1996);
        assertEquals(25,person.getAge());
        person.setAge(2000);
        assertEquals(21,person.getAge());
    }

    @Test
    void testUserCanSetAndGetAddress(){
//        person.setAddress("172", "washington Avenue", "Washington DC", "USA");
        assertEquals("172, WASHINGTON AVENUE, WASHINGTON DC, USA", person.getAddress());
    }

}