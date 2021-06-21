package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinIdComparatorTest extends TestCase {
    @Test
    public void testCompare() {
        List<Item> input = Arrays.asList(
                new Item(4, "Petr"),
                new Item(2, "Ivan"),
                new Item(10, "Alexey"),
                new Item(7, "Kirill")
        );
        Collections.sort(input, new MinIdComparator());
        List<Item> rsl = Arrays.asList(
                new Item(10, "Alexey"),
                new Item(7, "Kirill"),
                new Item(4, "Petr"),
                new Item(2, "Ivan")
        );
        assertEquals(input, rsl);
    }
}