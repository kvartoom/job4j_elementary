package ru.job4j.array;

public class TwoNumbersSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] rsl = new int[2];
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int sum = array[i] + array[j];
            if (sum == target) {
                rsl = new int[]{i, j};
                return rsl;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}
