package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int substract = money - price;
        while (substract != 0) {
            for (size = 0; size < rsl.length; size++) {
                if (substract >= 10) {
                    substract -= coins[0];
                    rsl[size] = coins[0];
                } else if (substract >= 5) {
                    substract -= coins[1];
                    rsl[size] = coins[1];
                } else if (substract >= 2) {
                    substract -= coins[2];
                    rsl[size] = coins[2];
                } else if (substract == 1) {
                    substract -= coins[3];
                    rsl[size] = coins[3];
                } else if (substract == 0) {
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int[] result = change(100, 34);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
    }
}