package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (word[index] != pref[index] || word.length != pref.length) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[]args) {
        System.out.println(startsWith(new char[] {'П', 'р', 'и', 'в', 'е'}, new char[] {'П', 'р', 'и', 'в', 'е', 'т'}));
    }
}