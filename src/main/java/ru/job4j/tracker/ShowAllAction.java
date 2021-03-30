package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "Show all Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("All Items are loaded");
        System.out.println("All Items:");
        Item[] array = tracker.findAll();
        for (Item i : array) {
            System.out.println(i);
        }
        return true;
    }
}