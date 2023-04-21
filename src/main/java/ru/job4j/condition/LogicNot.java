package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) && !isPositive(num);
    }

    public static void main(String[] args) {
        boolean n = LogicNot.isEven(35);
        System.out.println(n);
        n = LogicNot.isPositive(35);
        System.out.println(n);
        n = LogicNot.notEven(35);
        System.out.println(n);
        n = LogicNot.notPositive(35);
        System.out.println(n);
        n = LogicNot.notEvenAndPositive(35);
        System.out.println(n);
        n = LogicNot.evenOrNotPositive(35);
        System.out.println(n);
    }
}