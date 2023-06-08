package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        if (word.length > pref.length) {
            for (int index = 0; index < pref.length; index++) {
                if (word[index] != pref[index]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[]args) {
        System.out.println(startsWith(new char[] {'П', 'р', 'и', 'в', 'е', 'т'}, new char[] {'П', 'р', 'е', 'в', 'е'}));
    }
}