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
}