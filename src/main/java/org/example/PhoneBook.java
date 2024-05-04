package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    static HashMap<String, String> contact = new HashMap<>();

    public static int addContact(String name, String number) {
        if (name.equals(contact.get(name))) {
        }
        if (contact.containsKey(name)) {
            contact.replace(name, contact.get(name));
        } else {
            contact.put(name, number);

            return contact.size();
        }


        return 0;
    }

    public String findByNumber(String name) {


        return null;
    }
}
