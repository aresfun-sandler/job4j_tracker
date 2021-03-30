package ru.job4j.tracker;

public class FindNameAction implements UserAction {
    public String name() {
        return "Find Item by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter the Item name you"
                + " want to search: ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (Item i : item) {
                System.out.println(i);
            }
        } else {
            System.out.println("Item with this name were not found.");
        }
        return true;
    }
}