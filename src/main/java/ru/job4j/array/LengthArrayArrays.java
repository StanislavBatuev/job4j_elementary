package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] arrayArrays = {{1}, {'A', 'B'}, {11, 22, 33}, {'a', 'b', 'c', 'd'}};
        for (int i = 0; i < arrayArrays.length; i++) {
            System.out.println("Размер вложенного массива равен: " + arrayArrays[i].length);
        }

    }
}
