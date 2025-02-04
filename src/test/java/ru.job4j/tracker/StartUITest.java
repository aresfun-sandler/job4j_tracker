//package ru.job4j.tracker;
//
//import org.hamcrest.core.Is;
//import org.junit.Test;
//import ru.job4j.tracker.*;
//
//import java.util.List;
//
//import static org.hamcrest.core.IsNull.nullValue;
//import static org.junit.Assert.assertThat;
//
//public class StartUITest {
//    @Test
//    public void whenCreateItem() {
//        Output output = new StubOutput();
//        Input in = new StubInput(
//                new String[] {"0", "Item name", "1"}
//        );
//        Tracker tracker = new Tracker();
//        List<UserAction> actions = List.of(
//                new CreateAction(output),
//                new ExitAction(output)
//        );
//        new StartUI(output).init(in, tracker, actions);
//        assertThat(tracker.findAll().getName(), Is.is("Item name"));
//    }
//
//    @Test
//    public void whenReplaceItem() {
//        Output output = new StubOutput();
//        Tracker tracker = new Tracker();
//        /* Добавим в tracker новую заявку */
//        List<Item> item = tracker.add(new Item("Replace Item"));
//        /* Входные данные должны содержать ID добавленной заявки item.getId() */
//        String replacedName = "New item name";
//        Input in = new StubInput(
//                new String[] {"0", "1", replacedName, "1"}
//        );
//        List<UserAction> actions = List.of(
//                new ReplaceAction(output),
//                new ExitAction(output)
//        );
//        new StartUI(output).init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()).getName(), Is.is(replacedName));
//    }
//
//    @Test
//    public void whenDeleteItem() {
//        Output output = new StubOutput();
//        Tracker tracker = new Tracker();
//        /* Добавим в tracker новую заявку */
//        List<Item> item = tracker.add(new Item("Deleted item"));
//        /* Входные данные должны содержать ID добавленной заявки item.getId() */
//        Input in = new StubInput(
//                new String[] {"0", "1", "1"}
//        );
//        List<UserAction> actions = List.of(
//                new DeleteAction(output),
//                new ExitAction(output)
//        );
//        new StartUI(output).init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()), Is.is(nullValue()));
//    }
//
//    @Test
//    public void whenAllAction() {
//        Output output = new StubOutput();
//        Tracker tracker = new Tracker();
//        /* Добавим в tracker новую заявку */
//        List<Item> item = tracker.add(new Item("Show all Items"));
//        /* Входные данные должны содержать ID добавленной заявки item.getId() */
//        Input in = new StubInput(
//                new String[] {"0", "1"}
//        );
//        List<UserAction> actions = List.of(
//                new ShowAllAction(output),
//                new ExitAction(output)
//        );
//        new StartUI(output).init(in, tracker, actions);
//        String ln = System.lineSeparator();
//        assertThat(output.toString(), Is.is(
//                "Menu." + ln
//                        + "0. Show all Items" + ln
//                        + "1. Exit the program" + ln
//                        + "All Items are loaded" + ln
//                        + "All Items:" + ln
//                        + item + ln
//                        + "Menu." + ln
//                        + "0. Show all Items" + ln
//                        + "1. Exit the program" + ln
//                )
//        );
//    }
//
//    @Test
//    public void whenByNameAction() {
//        Output output = new StubOutput();
//        Tracker tracker = new Tracker();
//        List<Item> item = tracker.add(new Item("Find Item by name"));
//        Input in = new StubInput(
//                new String[] {"0", item.getName(), "1"}
//        );
//        List<UserAction> actions = List.of(
//                new FindNameAction(output),
//                new ExitAction(output)
//        );
//        new StartUI(output).init(in, tracker, actions);
//        String ln = System.lineSeparator();
//        assertThat(output.toString(), Is.is(
//                "Menu." + ln
//                        + "0. Find Item by name" + ln
//                        + "1. Exit the program" + ln
//                        + item + ln
//                        + "Menu." + ln
//                        + "0. Find Item by name" + ln
//                        + "1. Exit the program" + ln
//                )
//        );
//    }
//
//    @Test
//    public void whenByIdAction() {
//        Output output = new StubOutput();
//        Tracker tracker = new Tracker();
//        /* Добавим в tracker новую заявку */
//        List<Item> item = tracker.add(new Item("Find Item by id"));
//        /* Входные данные должны содержать ID добавленной заявки item.getId() */
//        Input in = new StubInput(
//                new String[] {"0", Integer.toString(item.getId()), "1"}
//        );
//        List<UserAction> actions = List.of(
//                new FindIdAction(output),
//                new ExitAction(output)
//        );
//        new StartUI(output).init(in, tracker, actions);
//        String ln = System.lineSeparator();
//        assertThat(output.toString(), Is.is(
//                "Menu." + ln
//                        + "0. Find Item by id" + ln
//                        + "1. Exit the program" + ln
//                        + item + ln
//                        + "Menu." + ln
//                        + "0. Find Item by id" + ln
//                        + "1. Exit the program" + ln
//                )
//        );
//    }
//
//    @Test
//    public void whenInvalidExit() {
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[] {"7", "0"}
//        );
//        Tracker tracker = new Tracker();
//        List<UserAction> actions = List.of(
//                new ExitAction(out)
//        );
//        new StartUI(out).init(in, tracker, actions);
//        String ln = System.lineSeparator();
//        assertThat(out.toString(), Is.is(
//                "Menu." + ln
//                        + "0. Exit the program" + ln
//                        + "Wrong input, you can select: 0 .. 0" + ln
//                        + "Menu." + ln
//                        + "0. Exit the program" + ln
//                )
//        );
//    }
//}