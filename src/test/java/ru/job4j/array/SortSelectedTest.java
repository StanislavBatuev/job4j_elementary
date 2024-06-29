package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when1058845Then5108845() {
        int[] input = {10, 5, 88, 45};
        int[] expected = {5, 10, 45, 88};
        int[] output = SortSelected.sort(input);
        assertThat(output).containsExactly(expected);
    }
}