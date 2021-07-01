package ru.job4j.function;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {
    public static void main(String[] args) {
        List<String> input = Arrays.asList(
               "Ivan",
               "Petr"
        );
        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare - " + right + " : " + left);
            return right.compareTo(left);
        };
        input.sort(comparator);
        System.out.println(input);
    }
}