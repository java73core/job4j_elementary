package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        int x1 = 0, y1 = 0;
        int x2 = 2, y2 = 0;
        double expected = 2;

        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when52to_10then6() {
        int x1 = 5, y1 = 2;
        int x2 = -1, y2 = 0;
        double expected = 6.32;

        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when4_4to2_2then2() {
        int x1 = 4, y1 = -4;
        int x2 = 2, y2 = -2;
        double expected = 2.82;

        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}