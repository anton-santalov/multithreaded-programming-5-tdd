package com.antonsantalov;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PhoneBook {
    private final Map<String, String> contacts = new ConcurrentHashMap<>();
    private final Map<String, String> reversedContacts = new ConcurrentHashMap<>();

    public int add(String nickname, String phoneNumber) {
        contacts.put(nickname, phoneNumber);
        reversedContacts.put(phoneNumber, nickname);
        return contacts.size();
    }

    public String findByNumber(String phoneNumber) {
        return reversedContacts.get(phoneNumber);
    }

    public String findByName(String nickname) {
        return contacts.get(nickname);
    }
}
