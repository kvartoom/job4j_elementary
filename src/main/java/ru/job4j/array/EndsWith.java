package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] pref) {
        boolean result = true;
        int minLength = word.length;
        if (word.length > pref.length) {
            minLength = pref.length;
        }
        for (int index = 0; index < (minLength - 1 - index) / 2; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
