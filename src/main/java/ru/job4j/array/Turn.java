package ru.job4j.array;

import java.util.Arrays;

public class Turn {
    public static int[] turnItOver(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp;
            temp = array[i];
             array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(turnItOver(array)));
    }
}
