package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        return max(first,
                    max(second, third)
        );
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first,
                    max(second, third, fourth)
        );
    }

    public static void main(String[] args) {
        int result = Max.max(38, 35);
        System.out.println(result);
        int threeParams = max(45, 14, 50);
        System.out.println(threeParams);
        int fourParams = max(12, 23, 50, 60);
        System.out.println(fourParams);
    }
}