package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] arrey) {
        for (int row = 0; row < arrey.length; row++) {
            for (int cell = 0; cell < arrey[row].length; cell++) {
                if (arrey[row][cell] < 0) {
                    arrey[row][cell] = 0;
                }
            }
        }
        return arrey;
    }
}