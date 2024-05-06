package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
        for (String names : contact.keySet()) {
            String number = contact.get(names);
            if (number.equals(contact.get(names))) {
                return names;
            }
        }
        return null;
    }

    public String findByName(String name) {
        contact.get(PhoneBook.contact.get(name));
        return name;
    }

    public String printAllNames() {
       return null;
    }

}

