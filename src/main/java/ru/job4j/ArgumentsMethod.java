package ru.job4j;

public class ArgumentsMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Jub4j";
        int age = 6;
        ArgumentsMethod.hello(name, age);
    }
}