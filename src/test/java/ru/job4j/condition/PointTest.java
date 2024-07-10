package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when771010Then4Dot2426() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when7Minus7Minus10Minus10Then17Dot2626() {
        Point a = new Point(-10, -10);
        Point b = new Point(7, -7);
        double expected = 17.2626;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when7710Minus100Then93Dot0483() {
        Point a = new Point(10, -100);
        Point b = new Point(7, -7);
        double expected = 93.0483;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when111And222Then1Dot7320() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(2, 2, 2);
        double expected = 1.7320;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }
}