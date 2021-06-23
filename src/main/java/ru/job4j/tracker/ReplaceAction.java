//package ru.job4j.tracker;
//
//public class ReplaceAction implements UserAction {
//    private final Output out;
//
//    public ReplaceAction(Output out) {
//        this.out = out;
//    }
//
//    @Override
//    public String name() {
//        return "Replace Item";
//    }
//
//    @Override
//    public boolean execute(Input input, Tracker tracker) {
//        int id = input.askInt("Enter the Item "
//                + "id you want to change");
//        String name = input.askStr("Enter Item name you "
//                + "want to replace: ");
//        Item item = new Item(name);
//        boolean success = tracker.replace(id, item);
//        if (success) {
//            out.println("Replacement was successful");
//        } else {
//            out.println("An error has occurred");
//        }
//        return true;
//    }
//}
