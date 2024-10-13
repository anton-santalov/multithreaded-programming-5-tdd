package com.antonsantalov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneBookTest {

    @Test
    void addOnePerson() {
        int expected = 1;

        PhoneBook phoneBook = new PhoneBook();
        int actual = phoneBook.add("John Doe", "1234567891011");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addOnePersonTwice() {
        int expected = 1;

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John Doe", "1234567891011");
        int actual = phoneBook.add("John Doe", "1234567891011");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addTwoPeople() {
        int expected = 2;

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John Doe", "1234567891011");
        int actual = phoneBook.add("Jane Doe", "1234567891012");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findByNumberInEmptyPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        String actual = phoneBook.findByNumber("1234567891011");

        Assertions.assertNull(actual);
    }

    @Test
    void findByNumberInPhoneBookWithOnePhoneNumber() {
        String expected = "John Doe";

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John Doe", "1234567891011");
        String actual = phoneBook.findByNumber("1234567891011");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findByNumberInPhoneBookWithMultiplePhoneNumbers() {
        String expected = "John Doe";

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John Doe", "1234567891011");
        phoneBook.add("Jane Doe", "1234567891012");
        String actual = phoneBook.findByNumber("1234567891011");

        Assertions.assertEquals(expected, actual);
    }
}