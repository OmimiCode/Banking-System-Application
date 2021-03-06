package com.bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneralTest {

    @BeforeEach
    void setUP(){

    }

    @AfterEach
    void tearDown() {

    }


    @Test
    void testThatWeCanSetAndGetAccountNumber() {
        //given
        Account account = new Account() {
            @Override
            public void withdraw(double withdrawalAmount) {

            }

            @Override
            public void debit(double debitAmount) {

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

            @Override
            public void debit(double debitAmount) {

            }
        };
        Account account2 = new Account() {
            @Override
            public void withdraw(double withdrawalAmount) {

            }

            @Override
            public void debit(double debitAmount) {

            }
        };

        String accNumber1 = account1.getAccountNumber();
        System.out.println("ACCOUNT NUMBER 1: " + accNumber1);
        assertEquals(accNumber1, account1.getAccountNumber());


        String accNumber2 = account2.getAccountNumber();
        System.out.println("ACCOUNT NUMBER 2: " + accNumber2);
        assertEquals(accNumber2, account2.getAccountNumber());

        System.out.printf("account number 1:%s%n account number 2:%s%n", accNumber1, accNumber2);
        assertNotEquals(accNumber1, accNumber2);

        Account autoAccount = new Account() {
            @Override
            public void withdraw(double withdrawalAmount) {

            }

            @Override
            public void debit(double debitAmount) {

            }
        };

        System.out.println("AUTO-ACCOUNT NUMBER GENERATION : " + autoAccount.getAccountNumber());

        Account account3 = new SavingsAccount();
        String accNumber3 = account3.getAccountNumber();
        System.out.println("ACCOUNT NUMBER 3: " + accNumber3);


    }


    @Test
    void testThatWeCanSetAndGetAccountBalance() {
        Account account = new Account() {
            @Override
            public void withdraw(double withdrawalAmount) {

            }

            @Override
            public void debit(double debitAmount) {

            }
        };
        account.setBalance(98765432.1);
        assertEquals(98765432.1, account.getBalance());
        account.setBalance(1000);
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    void testThatWeCanDepositMoneyIntoTheAccount() {
        Account account = new Account() {
            @Override
            public void withdraw(double withdrawalAmount) {

            }

            @Override
            public void debit(double debitAmount) {

            }
        };
        account.setBalance(180);
        account.deposit(100.0);
        assertEquals(280, account.getBalance());
    }

    @Test
    void testAccountCanTransferMoneyFromOneAccountToTheOther() {

        Account account1 = new CurrentAccount();
        Account account2 = new SavingsAccount();

        assertEquals(1111, account1.getPin());
        account1.deposit(2000000);
        assertEquals(2000000, account1.getBalance());

        assertEquals(1111, account2.getPin());
        account2.deposit(1000000);
        assertEquals(1000000, account2.getBalance());


        account1.transfer(500000, account2);
        assertEquals(1500000, account2.getBalance());
        assertEquals(1500000, account1.getBalance());


        assertThrows(IllegalArgumentException.class, () -> account2.transfer(1500000, account1));

        assertEquals(1500000, account2.getBalance());
        assertEquals(1500000, account1.getBalance());

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
    @Test
    void ThatWeCanCreateANewCustomerWIthCurrentAccount(){
        Account samCurrentAccount = new CurrentAccount("SCB1234",0.0,1111);
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
        Account savingsAccount1 = new SavingsAccount("SCB1111", 0.0, 1111);
        Customer shola = new Customer("","", "","","", 0, "", savingsAccount1);
        shola.account.setAccountNumber("SCB111");
        assertEquals(0, shola.account.getBalance());
        shola.account.deposit(1000);
        assertEquals(1000, shola.account.getBalance());
        shola.account.deposit(1000000);

        assertThrows(IllegalArgumentException.class, ()-> shola.account.withdraw(1000050));

        Person peter = new Customer();

        peter.account = new SavingsAccount();

        System.out.println(peter.account.getAccountNumber());

    }

    @Test
    void testThatWeCanWithdrawUnlimitedAmountFromACurrentAccountGivenThatCurrentBalanceIsGreaterThanWithdrawalAmount(){
        Account currentAccount = new CurrentAccount();
        currentAccount.setBalance(100.0);

        currentAccount.withdraw(80);
        assertEquals(20,currentAccount.getBalance());


        assertThrows(IllegalArgumentException.class, ()-> currentAccount.withdraw(30));

    }


    @Test
    void ThatWeCanCreateANewCustomerWIthCurrentAccountWithArgumentConstructor(){
        Account samCurrentAccount = new CurrentAccount("SCB1234",0.0,1111);
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
    void ThatWeCanCreateANewCustomerWIthSavingsAccountWithArgumentConstructor(){
        Account savingsAccount1 = new SavingsAccount("SCB1111", 0.0, 1111);
        Customer shola = new Customer("","", "","","", 0, "", savingsAccount1);
        shola.account.setAccountNumber("SCB111");
        assertEquals(0, shola.account.getBalance());
        shola.account.deposit(1000);
        assertEquals(1000, shola.account.getBalance());
        shola.account.deposit(1000000);
//        shola.account.withdraw(1000050);
//        assertEquals(950, shola.account.getBalance());
        assertThrows(IllegalArgumentException.class, ()-> shola.account.withdraw(1000050));

        Person peter = new Customer();
//        Customer john = new Person();
        peter.account = new SavingsAccount();

        System.out.println(peter.account.getAccountNumber());

    }


    Person person = new Person("paul", "john","bill", "male","12/7/1996", 25,"172, washington Avenue, Washington DC, USA" );

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







