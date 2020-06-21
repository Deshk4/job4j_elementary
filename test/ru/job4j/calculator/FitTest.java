package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenManWeight() {
        short heightMan = 178;
        double expectedManWeight = 89.69999999999999;
        double outManWeight = Fit.manWeight(heightMan);

        Assert.assertEquals(expectedManWeight, outManWeight, 0.01);

    }

    @Test
    public void whenWomanWeight() {
        short heightWoman = 145;
        double expectedWomanWeight = 40.25;
        double outWomanWeight = Fit.womanWeight(heightWoman);

        Assert.assertEquals(expectedWomanWeight, outWomanWeight, 0.01);
    }
}