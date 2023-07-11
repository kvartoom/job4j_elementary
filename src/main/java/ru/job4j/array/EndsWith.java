package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < (word.length - 1 - index); index++) {
            if (word[word.length - 1 - index] != pref[pref.length - 1 - index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}