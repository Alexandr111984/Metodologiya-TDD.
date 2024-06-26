package org.example;

import org.junit.jupiter.api.Test;

import javax.xml.namespace.QName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    @Test
    void testAddContacts() {
        PhoneBook phoneBook = new PhoneBook();
        PhoneBook.addContact("Sat", "363635");
        PhoneBook.addContact("San", "363634");
        PhoneBook.addContact("Vasya", "363633");


        assertEquals(3, phoneBook.contact.size());
    }


    @Test
    void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        PhoneBook.addContact("Pol", "2233");
        PhoneBook.addContact("Pul", "2255");
        PhoneBook.addContact("Pup", "2288");
        String namber = "2255";


        assertEquals("Pul", phoneBook.findByNumber(namber));

    }

    @Test
    void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        PhoneBook.addContact("Pol", "2233");
        PhoneBook.addContact("Pul", "2255");
        PhoneBook.addContact("Pup", "2288");
        assertEquals("2233", PhoneBook.contact.get(phoneBook.findByName("Pol")));
    }

    @Test
    void testPrintAllNamesTrue() {
        PhoneBook phoneBook = new PhoneBook();
        PhoneBook.addContact("Pol", "2233");
        PhoneBook.addContact("Sat", "2255");
        PhoneBook.addContact("Lizaveta", "2288");
        assertEquals("[Lizaveta, Pol, Sat]", phoneBook.printAllNames());
    }
}