package ru.job4j.oop;

public class Max {
    public int max(int one, int two) {
        return one > two ? one : two;
    }

    public int max(int one, int two, int three) {
        int tmp = max(one, two);
        return max(tmp, three);
    }

    public int max(int one, int two, int three, int four) {
        int tmp = max(one, two);
        return max(tmp, max(three, four));
    }
}