//package ru.job4j.tracker;
//
//import org.junit.Test;
//import ru.job4j.tracker.*;
//
//import static org.hamcrest.Matchers.is;
//import static org.junit.Assert.assertThat;
//
//public class ValidateInputTest {
//
//    @Test
//    public void whenInvalidInput() {
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[] {"one", "1"}
//        );
//        ValidateInput input = new ValidateInput(out, in);
//        int selected = input.askInt("Enter menu:");
//        assertThat(selected, is(1));
//    }
//
//    @Test
//    public void whenInvalidOneNumberInput() {
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[] {"1"}
//        );
//        ValidateInput input = new ValidateInput(out, in);
//        int selected = input.askInt("Enter menu:");
//        assertThat(selected, is(1));
//    }
//
//    @Test
//    public void whenInvalidSomeNumberInput() {
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[] {"1", "1", "1"}
//        );
//        ValidateInput input = new ValidateInput(out, in);
//        int selected = input.askInt("Enter menu:");
//        assertThat(selected, is(1));
//    }
//
//    @Test(expected = ArrayIndexOutOfBoundsException.class)
//    public void whenInvalidNegativeNumberInput() {
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[] {"-1"}
//        );
//        ValidateInput input = new ValidateInput(out, in);
//        int selected = input.askInt("Enter menu:");
//        assertThat(selected, is(1));
//    }
//}