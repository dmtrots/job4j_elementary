package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{24, 1, 1000, 5}));
    }
}