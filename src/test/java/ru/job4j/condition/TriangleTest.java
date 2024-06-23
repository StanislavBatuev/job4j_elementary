package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TriangleTest {

    @Test
    void whenAB2AC2BC2ThenTrue() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean output = Triangle.exist(ab, ac, bc);
        assertThat(output).isTrue();
    }

    @Test
    void whenAB0Don5AC1BC2ThenFalse() {
        double ab = 0.5;
        double ac = 1.0;
        double bc = 2.0;
        boolean output = Triangle.exist(ab, ac, bc);
        assertThat(output).isFalse();
    }
}