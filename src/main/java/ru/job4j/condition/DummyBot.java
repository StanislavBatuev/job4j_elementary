package ru.job4j.condition;

public class DummyBot {
    public static String answer(String request) {
        String result = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(request)) {
            result = "Hi, Smart Ass!";
        } else if ("Bye.".equals(request)) {
            result = "See you later!";
        } else {
            return result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(answer("Hi, Bot."));
        System.out.println(answer("Bye."));
    }
}