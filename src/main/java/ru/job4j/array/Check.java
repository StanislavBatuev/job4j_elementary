package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] arrayOne = {true, false};
        boolean[] arrayTwo = {true, true};
        System.out.println(mono(arrayOne));
        System.out.println(mono(arrayTwo));
    }
}