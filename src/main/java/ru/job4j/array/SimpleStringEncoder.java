package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                if (counter == 1) {
                    result = result + symbol;
                    symbol = input.charAt(i);
                } else {
                    result = result + symbol + counter;
                    counter = 1;
                    symbol = input.charAt(i);
                }
            }
        }
        result = counter == 1 ? result + symbol : result + symbol + counter;
        return result;
    }

    public static void main(String[] args) {
        String result = encode("abbbccddd");
        System.out.println(result);
    }
}