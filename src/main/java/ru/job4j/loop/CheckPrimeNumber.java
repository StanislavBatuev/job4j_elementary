package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        boolean prime = num > 1;
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(CheckPrimeNumber.check(9));
    }
}