package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 175;
        double man = manWeight(height);
        double woman = womanWeight(height);
        System.out.println("Man 175cm is " + man);
        System.out.println("Woman 175cm is " + woman);
    }
}
