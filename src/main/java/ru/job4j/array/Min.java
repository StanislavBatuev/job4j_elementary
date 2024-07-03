package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }
}
