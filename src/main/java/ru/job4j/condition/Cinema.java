package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        System.out.println("Age of customer " + age);
        if (age >= 18) {
            System.out.println("Welcome to cinema");
        } else {
            System.out.println("You are to young for this movie.");
        }
    }

    public static void main(String[] args) {
        access(15);
        access(21);
    }
}
