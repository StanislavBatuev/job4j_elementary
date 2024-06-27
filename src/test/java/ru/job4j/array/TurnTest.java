package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TurnTest {

    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.turnItOver(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenArrayHas12345Then54321() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] output = Turn.turnItOver(input);
        int[] expected = new int[] {5, 4, 3, 2, 1};
        assertThat(output).containsExactly(expected);

    }
}