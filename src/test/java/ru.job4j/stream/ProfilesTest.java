package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void testCollect() {
        List<Profile> list = List.of(
                new Profile(new Address("Rostov", "Zorge", 12, 4)),
                new Profile(new Address("Rostov", "Vetrogradova", 34, 3)),
                new Profile(new Address("Rostov", "Stachky", 5, 1)),
                new Profile(new Address("Rostov", "Malinovkogo", 13, 5))
        );
        Profiles profiles = new Profiles();
        List<Address> rsl = profiles.collect(list);
        List<Address> expected = List.of(
                new Address("Rostov", "Zorge", 12, 4),
                new Address("Rostov", "Vetrogradova", 34, 3),
                new Address("Rostov", "Stachky", 5, 1),
                new Address("Rostov", "Malinovkogo", 13, 5)
        );
        assertThat(rsl, is(expected));
    }
}