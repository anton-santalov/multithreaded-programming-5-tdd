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
}