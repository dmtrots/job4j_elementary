package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (start <= index && index <= finish && data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        System.out.println(indexOf(new int[] {5, 10, 1000, 24}, 24));
        System.out.println(indexInRange(new int[] {5, 10, 1000, 24}, 24, 1, 2));
    }
}