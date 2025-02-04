//package ru.job4j.tracker;
//
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Tracker {
//    private final List<Item> items = new ArrayList<Item>();
//    private int ids = 1;
//
//    public List<Item> add(Item item) {
//        item.setId(ids++);
//        items.add(item);
//        return items;
//    }
//
//    public List<Item> findAll() {
//        return List.copyOf(items);
//    }
//
//    public List<Item> findByName(String key) {
//        List<Item> itemWithName = new ArrayList<Item>(items.size());
//        int scale = 0;
//        for (int i : items) {
//            List<Item> item = items.add(i);
//            if (item.get(i).equals(key)) {
//                itemWithName.add(scale);
//                scale++;
//            }
//        }
//        return List.copyOf(items);
//    }
//
//    public List<Item> findById(int id) {
//        int index = indexOf(id);
//        return index != -1 ? items.get(index) : null;
//    }
//
//    private int indexOf(int id) {
//        int rsl = -1;
//        for (int index = 0; index < items.size(); index++) {
//            if (items.get(index).getId() == id) {
//                rsl = index;
//                break;
//            }
//        }
//        return rsl;
//    }
//
//    public boolean replace(int id, Item item) {
//        int index = indexOf(id);
//        boolean rsl = index != -1;
//        if (rsl) {
//            item.setId(id);
//            items.set(index, item);
//        }
//        return rsl;
//    }
//
//    public boolean delete(int id) {
//        int index = indexOf(id);
//        boolean rsl = index != -1;
//        if (rsl) {
//            items.remove(index);
//        }
//        return rsl;
//    }
//}