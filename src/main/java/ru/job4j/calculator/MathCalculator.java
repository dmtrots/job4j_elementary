package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double substractAndDivide(double first, double second) {
        return substract(first, second)
                + divide(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + substract(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат первого расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат второго расчета равен: " + substractAndDivide(10, 20));
            System.out.println("Результат третьего расчета равен: " + sumAll(10, 20));
    }
}