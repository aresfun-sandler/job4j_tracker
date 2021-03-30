package ru.job4j.tracker;


public class StartUI {

//    public static void createItem(Input input, Tracker tracker) {
//        System.out.println("=== Create a new Item ====");
//        String name = input.askStr("Enter name: ");
//        Item item = new Item(name);
//        tracker.add(item);
//    }
//
//    public static void showAllItem(Tracker tracker) {
//        System.out.println("All Items are loaded");
//        System.out.println("All Items:");
//        Item[] array = tracker.findAll();
//        for (Item i : array) {
//            System.out.println(i);
//        }
//    }
//
//    public static void replaceItem(Input input, Tracker tracker) {
//        int id = input.askInt("Enter the Item "
//                + "id you want to change");
//        String name = input.askStr("Enter Item name you "
//                + "want to replace: ");
//        Item item = new Item(name);
//        boolean success = tracker.replace(id, item);
//        if (success) {
//            System.out.println("Replacement was successful");
//        } else {
//            System.out.println("An error has occurred");
//        }
//    }
//
//    public static void deleteItem(Input input, Tracker tracker) {
//        int id = input.askInt("Enter the Item id you want to remove: ");
//        boolean success = tracker.delete(id);
//        if (success) {
//            System.out.println("Deletion was successful");
//        } else {
//            System.out.println("An error has occurred");
//        }
//    }
//
//    public static void findItemId(Input input, Tracker tracker) {
//        int id = input.askInt("Enter the Item id you want to find: ");
//        Item item = tracker.findById(id);
//        if (item != null) {
//            System.out.println("Name Item: " + item.getName()
//                    + System.lineSeparator() + "Id Item: " + item.getId());
//        } else {
//            System.out.println("Item with this id was not found");
//        }
//    }
//
//    public static void findItemName(Input input, Tracker tracker) {
//        String name = input.askStr("Enter the Item name you"
//                + " want to search: ");
//        Item[] item = tracker.findByName(name);
//        if (item.length > 0) {
//            for (Item i : item) {
//                System.out.println(i);
//            }
//        } else {
//            System.out.println("Item with this name were not found.");
//        }
//    }

        public void init(Input input, Tracker tracker, UserAction[] actions) {
            boolean run = true;
            while (run) {
                this.showMenu(actions);
                int select = input.askInt("Select: ");
                UserAction action = actions[select];
                run = action.execute(input, tracker);
            }
        }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
//        Item nowDateTime = new Item();
////        String dateTime = nowDateTime.getCreated();
////        System.out.println(dateTime);
////        Tracker tracker = new Tracker();
////        tracker.add(nowDateTime);
////        System.out.println(tracker.findById(1));
//        System.out.println(nowDateTime);
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
//        new StartUI().init(input, tracker);
        UserAction[] actions = {
                new CreateAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}