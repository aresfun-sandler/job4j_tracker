package ru.job4j.collection;

import org.junit.Test;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

public class MaxPriorComparatorTest {

    @Test
    public void testCompare() {
        int rsl = new Job("Petr", 28)
                .compareTo(
                        new Job("Ivan", 27)
                );
        assertThat(rsl, greaterThan(0));
    }
}