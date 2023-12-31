package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double bc = 2.0;
        double ac = 2.0;
        boolean result = Triangle.exist(ab, bc, ac);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotExist() {
        double ab = 100.0;
        double bc = 2.0;
        double ac = 2.0;
        boolean result = Triangle.exist(ab, bc, ac);
        assertThat(result).isFalse();
    }
}