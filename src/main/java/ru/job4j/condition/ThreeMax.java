package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && second > third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        } else {
            result = third;
        }
        return result;
    }
}
