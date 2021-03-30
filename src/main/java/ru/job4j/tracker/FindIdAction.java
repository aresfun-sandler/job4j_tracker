package ru.job4j.tracker;

public class FindIdAction implements UserAction {
    public String name() {
        return "Find Item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter the Item id you want to find: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Name Item: " + item.getName()
                    + System.lineSeparator() + "Id Item: " + item.getId());
        } else {
            System.out.println("Item with this id was not found");
        }
        return true;
    }
}