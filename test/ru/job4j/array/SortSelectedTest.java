package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3Numbers() {
        int[] input = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort7Numbers() {
        int[] input = new int[] {3, 4, 1, 2, 5, 7, 8};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5, 7, 8};
        assertThat(result, is(expect));
    }
}