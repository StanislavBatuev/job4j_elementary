package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] surnames;
        short[] ages = new short[10];
        surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages - " + ages.length + "\n"
                + "Размер массива surnames - " + surnames.length + "\n"
                + "Размер массива prices - " + prices.length);
        String[] names = new String[4];
        names[0] = "Peiya";
        names[1] = "Vasya";
        names[2] = "Kolya";
        names[3] = "Doryna";
        System.out.println(names[3]);
    }
}
