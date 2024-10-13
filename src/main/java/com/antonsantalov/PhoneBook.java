package com.antonsantalov;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class PhoneBook {
    private final Map<String, String> contacts = new ConcurrentSkipListMap<>();
    private final Map<String, String> reversedContacts = new ConcurrentSkipListMap<>();

    public int add(String nickname, String phoneNumber) {
        if (!(contacts.containsKey(nickname) && reversedContacts.containsKey(phoneNumber))) {
            contacts.put(nickname, phoneNumber);
            reversedContacts.put(phoneNumber, nickname);
        }
        return contacts.size();
    }

    public String findByNumber(String phoneNumber) {
        return reversedContacts.get(phoneNumber);
    }

    public String findByName(String nickname) {
        return contacts.get(nickname);
    }

    public String printAllNames() {
        if (contacts.isEmpty()) {
            return null;
        } else {
            return String.join(", ", contacts.keySet());
        }
    }
}
