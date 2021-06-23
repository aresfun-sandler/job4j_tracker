package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] lft = left.split(" ");
        String[] rgt = right.split(" ");
//        StringBuffer sb = new StringBuffer(lft[0]);
//        StringBuffer sb2 = new StringBuffer(rgt[0]);
//        sb.setCharAt(lft[0].length() - 1, ' ');
//        sb2.setCharAt(rgt[0].length() - 1, ' ');
        for (int i = 0; i < lft.length; i++) {
            int rsl = Integer.compare(Integer.parseInt(lft[i]), Integer.parseInt(rgt[i]));
            if (rsl != 0) {
                return rsl;
            }
        }
        return Integer.compare(left.length(), right.length());
//        return Integer.compare(Integer.parseInt(lft[0].substring(0, lft.length - 1)),
//                Integer.parseInt(rgt[0].substring(0, rgt.length - 1)));
    }
}