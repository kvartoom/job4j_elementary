package ru.job4j.loop;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int expected = 120;
        int result = Factorial.calc(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenCalculateFactorialFor0Then1() {
        int n = 0;
        int expected = 1;
        int result = Factorial.calc(n);
        assertThat(result).isEqualTo(expected);
    }
}
