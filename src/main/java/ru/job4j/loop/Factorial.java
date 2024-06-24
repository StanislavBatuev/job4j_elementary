package ru.job4j.loop;

public class Factorial {

    public static int calculate(int num) {
        if (num <= 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {

            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate(5));
    }
}
