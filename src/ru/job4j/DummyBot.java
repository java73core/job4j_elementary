package ru.job4j;

public class DummyBot {

    public static String answer(String question) {
        String rsl;
        String rsl1 = "Привет, умник.";
        String rsl2 = "До скорой встречи.";
        String rsl3 = "Это ставит меня в тупик. Задайте другой вопрос.";
        String ans1 = "Привет, Бот";
        String ans2 = "Пока.";

        if (ans1.equals(question)) {
            rsl = rsl1;
        } else if (ans2.equals(question)) {
            rsl = rsl2;
        } else {
            return rsl3;
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
    }
}