package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenDistance() {
        int x1 = 2;
        int x2 = 4;
        int y1 = 3;
        int y2 = 5;
        double expectDistance = 2.82;
        double outDistance = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expectDistance, outDistance, 0.01);

    }
}