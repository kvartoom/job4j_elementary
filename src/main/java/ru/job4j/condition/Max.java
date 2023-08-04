package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        int resultFirst = first > second ? first : second;
        return resultFirst > third ? resultFirst : third;
    }

    public static int max(int first, int second, int third, int forth) {
        int resultFirst = first > second ? first : second;
        int resultSecond = third > forth ? third : forth;
        return resultFirst > resultSecond ? resultFirst : resultSecond;
    }

    public static void main(String[] args) {
        int result = max(7, 13);
        System.out.println(result);
    }
}
