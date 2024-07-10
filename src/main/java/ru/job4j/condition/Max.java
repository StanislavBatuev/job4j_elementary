package ru.job4j.condition;

public class Max {
    public static int comparisonOfNumbers(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third, int forth) {
        return Math.max(Math.max(first, second), Math.max(third, forth));
    }

    public static int max(int first, int second, int third) {
        return Math.max(Math.max(first, second), third);
    }

    public static double max(double first, int second, int third) {
        return Math.max(Math.max(first, second), third);
    }

    public static double max(int first, double second, int third) {
        return Math.max(Math.max(first, second), third);
    }

    public static void main(String[] args) {
        System.out.println(comparisonOfNumbers(500, 355));
        System.out.println(max(555.55, 500, 355));
    }
}