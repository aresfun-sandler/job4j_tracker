package ru.job4j.collection;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinNameComparatorTest {

    @Test
    public void testCompare() {
        List<Job> input = Arrays.asList(
                new Job("Petr", 28),
                new Job("Ivan", 27)
        );
        Iterator<Job> it = input.iterator();
        assertThat(it.next(), is(new Job("Petr", 28)));
        assertThat(it.next(), is(new Job("Ivan", 27)));
    }
}