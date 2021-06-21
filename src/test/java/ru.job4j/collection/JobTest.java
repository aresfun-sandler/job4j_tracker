package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void maxComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new MaxNameComparator().thenComparing(new MaxPriorComparator());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(1));
    }

    @Test
    public void minComparatorNameOrPriority() {
        Comparator<Job> cmpNamePriority = new MinNameComparator().thenComparing(new MinPriorComparator());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}