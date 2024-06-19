package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class X2Test {

    @Test
    void whenA10B0C0X2Then40() {
        int a = 0, b = 1, c = 1, x = 1;
        int expected = 2;
        int output = X2.calc(a, b, c, x);
        assertThat(output).isEqualTo(expected);
    }
}