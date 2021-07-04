package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void testCollect() {
        List<Profile> list = List.of(
                new Profile(new Address("Rostov", "Zorge", 12, 4)),
                new Profile(new Address("Moscow", "Vetrogradova", 34, 3)),
                new Profile(new Address("Novgorod", "Stachky", 5, 1)),
                new Profile(new Address("Lugansk", "Malinovkogo", 13, 5)),
                new Profile(new Address("Rostov", "Zorge", 12, 4))
        );
        Profiles profiles = new Profiles();
        List<Address> rsl = profiles.collect(list);
        List<Address> expected = List.of(
                new Address("Lugansk", "Malinovkogo", 13, 5),
                new Address("Moscow", "Vetrogradova", 34, 3),
                new Address("Novgorod", "Stachky", 5, 1),
                new Address("Rostov", "Zorge", 12, 4)
        );
        assertThat(rsl, is(expected));
    }
}
