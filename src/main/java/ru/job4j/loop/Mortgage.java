package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        amount = amount + amount * percent;
        while (amount > 0) {
            amount -= salary;
            amount = amount + amount * percent;
           year++;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(year(1000, 1200, 20));
    }
}