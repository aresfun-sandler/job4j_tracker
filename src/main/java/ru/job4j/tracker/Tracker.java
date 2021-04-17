package ru.job4j.tracker;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<Item>(100);
    private int ids = 1;
    private int size = 0;

    public List<Item> add(Item item) {
        item.setId(ids++);
       // items[size++] = item;
        items.add(item);
        return items;
    }

    public List<Item> findAll() {
     //   return Arrays.copyOf(items);
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> itemWithName = new ArrayList<Item>(items.size());
        int scale = 0;
        for (int i = 0; i < size; i++) {
            List<Item> item = items.add(i);
            if (item.get(i).equals(key)) {
                itemWithName(scale) = item;
                scale++;
            }
        }
      //  return itemWithName = Arrays.copyOf(List<Item>, size);
        return items;
    }

    public List<Item> findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.add(index) : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items.add(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items.add(index) = item;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            System.arraycopy(items, (index + 1), items, index, (size - index - 1));
            items.add(size - 1) = null;
            size--;
        }
        return rsl;
    }
}