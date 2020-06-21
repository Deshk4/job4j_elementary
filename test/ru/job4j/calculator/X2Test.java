package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class X2Test {

    @Test
    public void whenAllEqlOne() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expectedAllOne = 3;
        int outAllOne = X2.calc(a, b, c, x);
        assertThat(outAllOne, is(expectedAllOne));
    }

    @Test
    public void whenAZero() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expectedAZero = 2;
        int outAZero = X2.calc(a, b, c, x);
        assertThat(outAZero, is(expectedAZero));
    }

    @Test
    public void whenCZero() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expectedCZero = 2;
        int outCZero = X2.calc(a, b, c, x);
        assertThat(outCZero, is(expectedCZero));
    }

    @Test
    public void whenXZero() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expectedXZero = 1;
        int outXZero = X2.calc(a, b, c, x);
        assertThat(outXZero, is(expectedXZero));
    }
}