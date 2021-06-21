package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class MinPriorComparatorTest {

    @Test
    public void testCompare() {
        int rsl = new Job("Ivan", 27)
                .compareTo(
                        new Job("Petr", 28)
                );
        assertThat(rsl, lessThan(0));
    }
}