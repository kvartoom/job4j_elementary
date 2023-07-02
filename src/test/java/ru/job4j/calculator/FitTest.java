package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;
public class FitTest {

    @Test
    public void whenMan170Then80dot5() {
        short height = 170;
        double expected = 80.5;
        double out = Fit.manWeight(height);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short height = 170;
        double expected = 69;
        double out = Fit.womanWeight(height);
        assertEquals(expected, out, 0.01);
    }
}