package ru.job4j.oop;

public class Max {
    private int first;
    private int second;
    private int third;
    private int fourth;

    public Max(int one, int two, int three, int four) {
        this.first = one;
        this.second = two;
        this.third = three;
        this.fourth = four;
    }

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