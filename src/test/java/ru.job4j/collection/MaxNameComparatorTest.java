package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxNameComparatorTest {

    @Test
    public void testCompare() {
        List<Job> input = Arrays.asList(
                new Job("Petr", 27),
                new Job("Ivan", 28)
        );
        Iterator<Job> it = input.iterator();
        assertThat(it.next(), is(new Job("Petr", 27)));
        assertThat(it.next(), is(new Job("Ivan", 28)));
    }
}