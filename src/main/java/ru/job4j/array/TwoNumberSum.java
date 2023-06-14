package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        SortSelected.sort(array);
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                return new int[]{i, j};
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] result = getIndexes(new int[]{19, 3, 6, 1, 5, 3}, 7);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
    }
}