package ru.job4j.tracker;

import java.util.List;

public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("All Items are loaded");
        out.println("All Items:");
        List<Item> array = tracker.findAll();
        for (Item i : array) {
            out.println(i);
        }
        return true;
    }
}