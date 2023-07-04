package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax13To5Then13() {
        int left = 13;
        int right = 5;
        int out = Max.max(left, right);
        int expected = 13;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenMax7To100Then100() {
        int left = 7;
        int right = 100;
        int out = Max.max(left, right);
        int expected = 100;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenMax50To50Then50() {
        int left = 50;
        int right = 50;
        int out = Max.max(left, right);
        int expected = 50;
        assertThat(out).isEqualTo(expected);
    }
}