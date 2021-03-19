package ru.job4j.oop;

public class Fix {
    private String desc;

    public Fix(String word) {
        this.desc = word;
    }

    public static void main(String[] args) {
        String text = "Hello!";
        Fix fix = new Fix(text);
    }
}
