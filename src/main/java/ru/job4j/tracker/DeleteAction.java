package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter the Item id you want to remove: ");
        boolean success = tracker.delete(id);
        if (success) {
            System.out.println("Deletion was successful");
        } else {
            System.out.println("An error has occurred");
        }
        return true;
    }
}