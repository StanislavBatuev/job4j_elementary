package ru.job4j.calculator;

public class Fit {
    private static double calculateWeight(short height, int adjustment) {
        return (height - adjustment) * 1.15;
    }

    public static double manWeight(short height) {
        return calculateWeight(height, 100);
    }

    public static double womanWeight(short height) {
        return calculateWeight(height, 110);
    }

    public static void main(String[] args) {
        short womanHeight = 168;
        double womanWeight = Fit.womanWeight(womanHeight);
        System.out.println("Woman 168 cm has ideal weight: " + womanWeight + " kg");

        short manHeight = 187;
        double manWeight = Fit.manWeight(manHeight);
        System.out.println("Man 187 cm has ideal weight: " + manWeight + " kg");
    }
}