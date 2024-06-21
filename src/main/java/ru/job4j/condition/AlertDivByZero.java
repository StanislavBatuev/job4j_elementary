package ru.job4j.condition;

public class AlertDivByZero {

    public static void checkNumber(int number) {
        if (number < 0) {
            System.out.println("This is negative number.");
        } else if (number == 0) {
            System.out.println("You can't divide by zero.");
        }
    }

    public static void main(String[] args) {
        checkNumber(-1);
        checkNumber(0);
    }
}