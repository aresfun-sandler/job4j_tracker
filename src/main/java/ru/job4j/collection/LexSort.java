package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] lft = left.split(" ");
        String[] rgt = right.split(" ");
        for (int i = 0; i < lft.length; i++) {
            int rsl = Integer.compare(Integer.parseInt(lft[i]), Integer.parseInt(rgt[i]));
            if (rsl != 0) {
                return rsl;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}