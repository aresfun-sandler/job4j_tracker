package ru.job4j.tracker;

public class FindIdAction implements UserAction {
    private final Output out;

    public FindIdAction(Output out) {
        this.out = out;
    }

    public String name() {
        return "Find Item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter the Item id you want to find: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println("Name Item: " + item.getName()
                    + System.lineSeparator() + "Id Item: " + item.getId());
        } else {
            out.println("Item with this id was not found");
        }
        return true;
    }
}