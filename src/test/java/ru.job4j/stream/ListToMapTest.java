package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ListToMapTest {

    @Test
    public void testConversion() {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student(1, "Сидоров");
        Student student2 = new Student(4, "Иванов");
        Student student3 = new Student(11, "Попов");
        Student student4 = new Student(11, "Попов");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        ListToMap listToMap = new ListToMap();
        Map<String, Student> rsl = listToMap.conversion(list);
        Map<String, Object> expected = new HashMap<>(Map.of(
                "Попов", student3,
                "Иванов", student2,
                "Сидоров", student1
        ));
        assertThat(rsl, is(expected));
    }
}