package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Test;
import java.util.*;

public class MaxIdComparatorTest extends TestCase {

    @Test
    public void testMaxIdCompare() {
        List<Item> item = Arrays.asList(
                new Item(4, "Petr"),
                new Item(2, "Ivan"),
                new Item(10, "Alexey"),
                new Item(7, "Kirill")
        );

        Collections.sort(item, new MaxIdComparator());

        List<Item> rsl = Arrays.asList(
                new Item(2, "Ivan"),
                new Item(4, "Petr"),
                new Item(7, "Kirill"),
                new Item(10, "Alexey")
        );

        assertEquals(item, rsl);
    }
}