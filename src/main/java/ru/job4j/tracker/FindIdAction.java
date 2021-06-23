//package ru.job4j.tracker;
//
//import java.util.List;
//
//public class FindIdAction implements UserAction {
//    private final Output out;
//
//    public FindIdAction(Output out) {
//        this.out = out;
//    }
//
//    public String name() {
//        return "Find Item by id";
//    }
//
//    @Override
//    public boolean execute(Input input, Tracker tracker) {
//        int id = input.askInt("Enter the Item id you want to find: ");
//        List<Item> item = tracker.findById(id);
//        if (item != null) {
//            out.println(item);
//        } else {
//            out.println("Item with this id was not found");
//        }
//        return true;
//    }
//}