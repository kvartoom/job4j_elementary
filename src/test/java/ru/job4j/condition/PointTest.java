package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when54to914Then10d0t77() {
        int x1 = 5;
        int y1 = 4;
        int x2 = 9;
        int y2 = 14;
        double expected = Point.distance(x1, y1, x2, y2);
        double out = 10.77;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1020to2010Then14d0t14() {
        int x1 = 10;
        int y1 = 20;
        int x2 = 20;
        int y2 = 10;
        double expected = Point.distance(x1, y1, x2, y2);
        double out = 14.14;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when316to823Then8dot60() {
        int x1 = 3;
        int y1 = 16;
        int x2 = 8;
        int y2 = 23;
        double expected = Point.distance(x1, y1, x2, y2);
        double out = 8.60;
        Assert.assertEquals(expected, out, 0.01);
    }
}