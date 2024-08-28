package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan175Then86dot25() {
        short height = 175;
        double expected = 86.25;
        double out = Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman160Then57dot49() {
        short height = 160;
        double expected = 57.49;
        double out = Fit.womanWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenManHeight180ThenWeight92() {
        short height = 180;
        double expected = 92.0;
        double out = Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeight170ThenWeight69() {
        short height = 170;
        double expected = 69.0;
        double out = Fit.womanWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }
}

