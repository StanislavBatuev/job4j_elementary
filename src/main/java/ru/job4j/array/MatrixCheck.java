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

    public static boolean monoVertical(char[][] array, int column) {
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];

        }
        return result;
    }
}