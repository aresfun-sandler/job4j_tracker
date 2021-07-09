package ru.job4j.collection;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
            for (var value: persons) {
                if (value.getName().contains(key) || value.getSurname().contains(key)
                        || value.getAddress().contains(key) || value.getPhone().contains(key)) {
                    result.add(value);
                }
            }
        return result;
    }
}