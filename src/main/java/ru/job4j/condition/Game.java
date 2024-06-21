package ru.job4j.condition;

public class Game {
    public static void menu(String game) {
        if ("Super mario".equals(game)) {
            System.out.println("Start - Super mario");
        } else if ("Tanks".equals(game)) {
            System.out.println("Start - Tanks");
        } else if ("Tetris".equals(game)) {
            System.out.println("Start - Tetris");
        } else {
            System.out.println("We do not have the game " + game + " in our catalog");
        }
    }

    public static void main(String[] args) {
        menu("Tetris");
    }
}