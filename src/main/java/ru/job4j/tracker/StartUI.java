package ru.job4j.tracker;


import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(scanner.nextLine());
            if (select >= 0 && select <= 6) {
                if (select == 6) {
                    System.out.println("Exit");
                    run = false;
                } else if (select == 0) {
                    System.out.println("=== Create a new Item ====");
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    Item item = new Item(name);
                    tracker.add(item);
                } else if (select == 1) {
                    System.out.println("All Items are loaded");
                    System.out.println("All Items:");
                    Item[] array = tracker.findAll();
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                    }
                } else if (select == 2) {
                        System.out.println("Enter the Item id you want to change");
                        int id = scanner.nextInt();
                        String name = scanner.nextLine();
                        Item item = new Item(name);
                        boolean success = tracker.replace(id, item);
                        if (success) {
                            System.out.println("Replacement was successful");
                    } else {
                            System.out.println("An error has occurred");
                        }
                } else if (select == 3) {
                    System.out.println("Enter the Item id you want to remove");
                    int id = scanner.nextInt();
                    boolean success = tracker.delete(id);
                    if (success) {
                        System.out.println("Deletion was successful");
                    } else {
                        System.out.println("An error has occurred");
                    }
                } else if (select == 4) {
                    System.out.println("Enter the Item id you want to find");
                    int id = scanner.nextInt();
                    Item item = tracker.findById(id);
                    if (item != null) {
                        System.out.println("Name Item: " + item.getName()
                                + System.lineSeparator() + "Id Item: " + item.getId());
                    } else {
                        System.out.println("Item with this id was not found");
                    }
                } else {
                    System.out.println("Enter the Item name you want to search");
                    String name = scanner.nextLine();
                    Item[] item = tracker.findByName(name);
                    if (item.length > 0) {
                        for (int i = 0; i < item.length; i++) {
                            System.out.println(item[i]);
                        }
                    } else {
                        System.out.println("Item with this name were not found.");
                    }
                }
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select:");
    }

    public static void main(String[] args) {
//        Item nowDateTime = new Item();
////        String dateTime = nowDateTime.getCreated();
////        System.out.println(dateTime);
////        Tracker tracker = new Tracker();
////        tracker.add(nowDateTime);
////        System.out.println(tracker.findById(1));
//        System.out.println(nowDateTime);
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}