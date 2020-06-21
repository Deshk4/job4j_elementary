package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenS() {
        int p = 6;
        int k = 2;
        int expectedS = 2;
        double outS = SqArea.square(p, k);
        Assert.assertEquals(expectedS, outS, 0.01);

    }
}