package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumByEvenFromZeroToTenThenThirty() {
    int rsl = Counter.sumByEven(0, 10);
    int expected = 30;
    assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumFrom1ToFiveThen15() {
        int rsl = Counter.sum(1, 5);
        int expected = 15;
        assertThat(rsl, is(expected));
    }
}