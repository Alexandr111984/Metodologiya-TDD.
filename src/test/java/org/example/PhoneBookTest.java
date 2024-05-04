package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    @Test
    void testAddContacts() {
        PhoneBook phoneBook=new PhoneBook();
       PhoneBook.addContact("Sat","363635");
       PhoneBook.addContact("San","363634");
       PhoneBook.addContact("Vasya","363633");


       assertEquals(3, phoneBook.contact.size());





    }


}