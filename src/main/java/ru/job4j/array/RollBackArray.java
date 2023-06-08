package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int lastIndex = array[array.length - index - 1];
            int currentIndex = index;
            result[currentIndex] = lastIndex;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int number : rollback(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10})) {
            System.out.println(number);
        }
    }
}