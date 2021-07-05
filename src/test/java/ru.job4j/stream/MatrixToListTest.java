package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixToListTest {

    @Test
    public void testConvert() {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        MatrixToList matrixToList = new MatrixToList();
        List<Integer> rsl = matrixToList.convert(array);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(rsl, is(expected));
    }
}