package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenMaxFirst() {
        int result = MultiMax.max(5, 2, 3);
        assertThat(result, is(5));

    }

    @Test
    public void whenMaxSecond() {
        int result = MultiMax.max(1, 4, 3);
        assertThat(result, is(4));

    }

    @Test
    public void whenMaxThird() {
        int result = MultiMax.max(1, 2, 8);
        assertThat(result, is(8));

    }
}