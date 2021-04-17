package ru.job4j.tracker;

import java.util.List;

public class FindNameAction implements UserAction {
    private final Output out;

    public FindNameAction(Output out) {
        this.out = out;
    }

    public String name() {
        return "Find Item by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter the Item name you"
                + " want to search: ");
        List<Item> item = tracker.findByName(name);
        if (item.size() > 0) {
            for (Item i : item) {
                out.println(i);
            }
        } else {
            out.println("Item with this name were not found.");
        }
        return true;
    }
}