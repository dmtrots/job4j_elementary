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
    public void whenManHeight150ThenWeight57dot5() {
        short height = 150;
        double expected = 57.5;
        double out = Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeight180ThenWeight80dot5() {
        short height = 180;
        double expected = 80.5;
        double out = Fit.womanWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeight150ThenWeight46() {
        short height = 150;
        double expected = 46.0;
        double out = Fit.womanWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }
}

