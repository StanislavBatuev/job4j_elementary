package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] array, int numberOfRow) {
        boolean result = true;
        for (int row = 0; row < array[numberOfRow].length; row++) {
            if (array[numberOfRow][row] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }
}