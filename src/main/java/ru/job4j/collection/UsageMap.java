package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> mail = new HashMap<>();
        mail.put("alex-sandler@mail.ru", "Alex Sandler");
        for (String key : mail.keySet()) {
            String value = mail.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
