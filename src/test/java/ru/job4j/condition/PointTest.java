package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {
    @Test
    public void when11to79then10() {
        double expected = 10;
        int x1 = 1;
        int y1 = 1;
        int x2 = 7;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to45then5() {
        double expected = 5;
        int x1 = 1;
        int y1 = 1;
        int x2 = 4;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when46to2421then25() {
        double expected = 25;
        int x1 = 4;
        int y1 = 6;
        int x2 = 24;
        int y2 = 21;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to1724then25() {
        Point a = new Point(2, 4);
        Point b = new Point(17, 24);
        a.distance(b);
        int expected = 25;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when612to3022then26() {
        Point a = new Point(6, 12);
        Point b = new Point(30, 22);
        a.distance(b);
        int expected = 26;
        assertThat(a.distance(b)).isEqualTo(expected);
    }
}