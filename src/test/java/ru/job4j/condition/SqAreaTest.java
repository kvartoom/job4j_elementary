package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2dot0() {
        double p = 6;
        double k = 2;
        double expected = 2.0;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP20K40Then2dot38() {
        double p = 20;
        double k = 40;
        double expected = 2.38;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP15K33Then1dot61() {
        double p = 15;
        double k = 33;
        double expected = 1.61;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}