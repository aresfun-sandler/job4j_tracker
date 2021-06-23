package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            int rsl = Character.compare(first.charAt(i), second.charAt(i));
            if (rsl != 0) {
                return rsl;
            }
        }
        return Integer.compare(first.length(), second.length());
    }
}