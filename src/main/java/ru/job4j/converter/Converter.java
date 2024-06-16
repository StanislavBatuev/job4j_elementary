package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float volume) {
        return volume / 70;
    }

    public static float rubleToDollar(float volume) {
        return volume / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");

        float expected  = 2;
        float input = 140;
        float output = Converter.rubleToEuro(input);
        boolean passed = output == expected;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
}