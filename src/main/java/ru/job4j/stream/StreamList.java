package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(3);
        list.add(-2);
        list.add(6);
        List<Integer> sort = list.stream().filter(
                lst -> lst > 0
        ).collect(Collectors.toList());
        sort.forEach(System.out::println);
    }
}