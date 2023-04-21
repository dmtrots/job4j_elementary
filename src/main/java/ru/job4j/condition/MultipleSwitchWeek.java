package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static String numberOfDay(String name) {
     int value = switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        int value = MultipleSwitchWeek.numberOfDay("Monday");
        System.out.println(value);
    }
}