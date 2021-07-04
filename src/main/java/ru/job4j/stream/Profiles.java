package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        Comparator<Address> cmp = Comparator.comparing(Address::getCity);
        return profiles.stream().map(Profile::getAddress)
                .sorted(cmp).distinct().collect(Collectors.toList());
    }
}