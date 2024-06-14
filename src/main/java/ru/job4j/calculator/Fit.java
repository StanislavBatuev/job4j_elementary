package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 186;
        double manWeight = Fit.manWeight(manHeight);
        System.out.println("Man 187 is " + manWeight);
        short womanHeight = 168;
        double womanWeight = Fit.womanWeight(womanHeight);
        System.out.println("Man 187 is " + womanWeight);
    }
}