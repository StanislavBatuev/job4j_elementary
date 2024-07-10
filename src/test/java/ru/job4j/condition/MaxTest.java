package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenFirst500Second355Then500() {
        int second = 355, first = 500;
        int expected = 500;
        int output = Max.comparisonOfNumbers(first, second);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenFirst500Second355Third444Forth777Then777() {
        int second = 355, first = 500, third = 444, forth = 777;
        int expected = 777;
        int output = Max.max(first, second, third, forth);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenFirst500Second355Third444hen500() {
        int second = 355, first = 500, third = 444;
        int expected = 500;
        int output = Max.max(first, second, third);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenFirst11Dot11Second10Third5Then11Dot11() {
        int second = 10, third = 5;
        double first = 11.11;
        double expected = 11.11;
        double output = Max.max(first, second, third);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenFirst10Dot11Second11Dot11Third5Then11Dot11() {
        int first = 10, third = 5;
        double  second = 11.11;
        double expected = 11.11;
        double output = Max.max(first, second, third);
        assertThat(output).isEqualTo(expected);
    }
}