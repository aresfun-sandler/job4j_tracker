package ru.job4j.tracker;


public class StartUI {
    public static void main(String[] args) {
        Item nowDateTime = new Item();
        String dateTime = nowDateTime.getCreated();
        System.out.println(dateTime);
    }
}