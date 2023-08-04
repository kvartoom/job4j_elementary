package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

    @Test
    public void whenMax3To18To23Then23() {
        int first = 3;
        int second = 18;
        int third = 23;
        int out = Max.max(first, second, third);
        int expected = 23;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenMax69To55To127To126Then127() {
        int first = 69;
        int second = 55;
        int third = 127;
        int forth = 126;
        int out = Max.max(first, second, third, forth);
        int expected = 127;
        assertThat(out).isEqualTo(expected);
    }
}