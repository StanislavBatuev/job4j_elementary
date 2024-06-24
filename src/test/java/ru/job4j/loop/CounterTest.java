package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void thenStart10Finish5Then0() {
        int start = 10, finish = 5;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void thenStart0Finish5Then15() {
        int start = 0, finish = 5;
        int expected = 15;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void thenStart0Finish6Then21() {
        int start = 0, finish = 6;
        int expected = 21;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus51ToTenThenThirty() {
        int start = -51;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = -620;
        assertThat(result).isEqualTo(expected);
    }
}