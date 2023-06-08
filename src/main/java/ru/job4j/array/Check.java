package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if (data[0] != data[index]) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[]args) {
        System.out.println(mono(new boolean[] {true, true, true}));
        }
    }