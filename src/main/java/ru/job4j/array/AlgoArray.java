package ru.job4j.array;

public class AlgoArray {
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int[] temp = new int[1];
        temp[0] = array[0];
        array[0] = array[3];
        array[3] = temp[0];
        temp[0] = array[1];
        array[1] = array[2];
        array[2] = temp[0];
        temp[0] = array[4];
        array[4] = array[3];
        array[3] = temp[0];
        for (int i : array) {
            System.out.println(i);
        }
    }
}