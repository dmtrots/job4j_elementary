package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            if (symbol == input.charAt(i) && i != input.length() - 1) {
                counter++;
            } else {
                result += "" + counter + symbol;
                counter = 1;
                symbol = input.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String result = encode("aaabbbccddddd");
        System.out.println(result);
    }
}