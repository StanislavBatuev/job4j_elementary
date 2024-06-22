package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        if (num == 0) {
            return false;
        }
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        if (num == 0) {
            return false;
        }
        return num > 0;
    }

    public static boolean notEven(int num) {
        if (num == 0) {
            return false;
        }
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        if (num == 0) {
            return false;
        }
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        if (num == 0) {
            return false;
        }
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        if (num == 0) {
            return false;
        }
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        System.out.println(isEven(2));
        System.out.println(isPositive(2));
        System.out.println(notEven(3));
        System.out.println(notPositive(-3));
        System.out.println(notEvenAndPositive(3));
        System.out.println(evenOrNotPositive(-2));

    }

}