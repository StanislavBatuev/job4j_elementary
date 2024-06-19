package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when771010Then4Dot2426() {
        int x1 = 7, y1 = 7, x2 = 10, y2 = 10;
        double expected = 4.2426;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when7Minus7Minus10Minus10Then17Dot2626() {
        int x1 = 7, y1 = -7, x2 = -10, y2 = -10;
        double expected = 17.2626;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when7710Minus100Then107Dot0420() {
        int x1 = 7, y1 = 7, x2 = 10, y2 = -100;
        double expected = 107.0420;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }
}