package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int maxLength = word.length;
        if (word.length < pref.length) {
            maxLength = pref.length;
        }
        for (int index = 0; index < maxLength / 2; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}