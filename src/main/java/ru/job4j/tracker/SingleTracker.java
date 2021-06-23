//package ru.job4j.tracker;
//
//
//import java.util.List;
//
//public final class SingleTracker {
//    private Tracker tracker = new Tracker();
//
//    private static SingleTracker instance = new SingleTracker();
//
//    private SingleTracker() {
//
//    }
//
//    public static SingleTracker getInstance() {
//        if (instance == null) {
//            instance = new SingleTracker();
//        }
//        return instance;
//    }
//
//    public List<Item> add(Item item) {
//        return tracker.add(item);
//    }
//
//    public List<Item> findById(int id) {
//        return tracker.findById(id);
//    }
//
//    public List<Item> findAll() {
//        return tracker.findAll();
//    }
//
//    public List<Item> findByName(String name) {
//        return tracker.findByName(name);
//    }
//
//    public boolean replace(int id, Item item) {
//        return tracker.replace(id, item);
//    }
//
//    public boolean delete(int id) {
//        return tracker.delete(id);
//    }
//}
