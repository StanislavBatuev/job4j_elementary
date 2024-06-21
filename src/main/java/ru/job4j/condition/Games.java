package ru.job4j.condition;

public class Games {
    public static void permission(boolean hasMany, boolean parensBlessing) {
        if (hasMany && parensBlessing) {
            System.out.println("Go to the game club !");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(false, false);
        permission(false, true);
        permission(true, false);
    }
}