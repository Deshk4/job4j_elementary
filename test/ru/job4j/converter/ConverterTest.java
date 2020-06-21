package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert120RblThen2Dollar() {
        int inRu = 120;
        int expectedRu = 2;
        int outRu = Converter.rubleToDollar(inRu);
        Assert.assertEquals(expectedRu, outRu);
    }

    @Test
    public void whenConvert140RblThen2Euro() {
        int inEuro = 140;
        int expectEuro = 2;
        int outEuro = Converter.rubleToEuro(inEuro);
        Assert.assertEquals(expectEuro, outEuro);
    }
}