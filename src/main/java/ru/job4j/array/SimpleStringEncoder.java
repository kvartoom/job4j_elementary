package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            symbol = input.charAt(i);
            if (symbol == input.charAt(i - 1)) {
                counter++;
            } else {
                result = result + input.charAt(i - 1) + counter;
                counter = 1;
            }
        }
        return result;
    }
}
