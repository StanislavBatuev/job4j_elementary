package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] arrey) {
        int result = 0;
        for (int row = 0; row < arrey.length; row++) {
            for (int cell = 0; cell < arrey[row].length; cell++) {
                result += arrey[row][cell];
            }
        }
        return result;
    }
}
