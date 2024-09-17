package ru.job4j.calculator;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + multiply(d) + minus(d) + divide(d);
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        result = calculator.multiply(5);
        System.out.println(result);
        result = minus(10);
        System.out.println(result);
        result = calculator.divide(10);
        System.out.println(result);
        Calculator sumAll = new Calculator();
        result = sumAll.sumAllOperation(5);
        System.out.println(result);
    }
}
