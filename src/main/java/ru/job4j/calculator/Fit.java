package ru.job4j.calculator;

public class Fit {

    private static final double MAN_OFFSET = 100;
    private static final double WOMAN_OFFSET = 110;
    private static final double WEIGHT_FACTOR = 1.15;

    public static double calculateWeight(short height, double offset) {
        return (height - offset) * WEIGHT_FACTOR;
    }

    public static double manWeight(short height) {
        return calculateWeight(height, MAN_OFFSET);
    }

    public static double womanWeight(short height) {
        return calculateWeight(height, WOMAN_OFFSET);
    }

    public static void main(String[] args) {
        short height = 175;
        double man = manWeight(height);
        double woman = womanWeight(height);
        System.out.println("Man 175cm is " + man);
        System.out.println("Woman 175cm is " + woman);
    }
}