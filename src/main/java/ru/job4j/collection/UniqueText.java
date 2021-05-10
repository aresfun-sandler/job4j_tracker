package ru.job4j.collection;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String org : origin) {
            check.add(org);
        }
        for (String txt : text) {
           if (!check.contains(txt)) {
               rsl = false;
           }
        }
        return rsl;
    }
}