package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public Map<String, Student> conversion(List<Student> list) {
        return list.stream()
                .collect(Collectors
                        .toMap(Student::getSurname, student -> student, (t, t2) -> t));
    }
}
